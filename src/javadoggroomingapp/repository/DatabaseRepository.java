/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoggroomingapp.repository;

import javadoggroomingapp.domain.Person;
import javadoggroomingapp.domain.City;
import javadoggroomingapp.domain.Dog;
import javadoggroomingapp.domain.Appointment;
import javadoggroomingapp.domain.Salon;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javadoggroomingapp.domain.TreatmentType;
import javadoggroomingapp.domain.User;

/**
 *
 * @author anavu
 */
public class DatabaseRepository {

    public void savePerson(Person person) {

        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "insert into person values (?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, person.getPersonID());
            ps.setString(2, person.getFirstname());
            ps.setString(3, person.getLastname());
            ps.setString(4, person.getContactNumber());

            int result = ps.executeUpdate();
            System.out.println("Affected records: " + result);

            ps.close();

        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex.getMessage());
        }
    }

    public List<Person> getPersons() {
        try {
            List<Person> persons = new ArrayList<>();
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "SELECT * FROM person";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                Long id = rs.getLong("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String contactNumber = rs.getString("contact_number");
                int appointment_number = rs.getInt("appointment_number");

                persons.add(new Person(id, firstname, lastname, contactNumber, appointment_number));
            }

            s.close();

            return persons;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /* 
    public Person getOsobaById(Long id) {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "select * from person where personid=" + id;
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                Person o = new Person();
                o.setPersonID(rs.getLong("personid"));
                o.setFisrtname(rs.getString("firstname"));
                o.setContactNumber(rs.getString("contactnumber"));
                return o;
            }
            
            s.close();
            return null;
        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex);
            return null;
        }
    }
     */
    public void removePerson(Long id) {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "delete from person where personid=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);
            int result = ps.executeUpdate();
            System.out.println("Affected records: " + result);

            ps.close();

        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex.getMessage());
        }
    }

    public void saveDog(Dog dog) {

        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "insert into dog values(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, dog.getDogID());
            ps.setString(2, dog.getName());
            ps.setString(3, dog.getBreed());
            int result = ps.executeUpdate();
            System.out.println("Affected records: " + result);

            ps.close();

        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex.getMessage());
        }
    }

    public List<Dog> getPsi() {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<Dog> dogs = new ArrayList<>();

            String query = "select * from dog order by name";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                Long id = rs.getLong("dogid");
                String name = rs.getString("name");
                String breed = rs.getString("breed");

                //dogs.add(new Dog(id, name, breed));
            }

            s.close();
            rs.close();
            return dogs;

        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex.getMessage());
            return null;
        }

    }

    public void removeDog(Long id) {

        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "delete from dog where dogid=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);
            int result = ps.executeUpdate();
            System.out.println("Affected records: " + result);

            ps.close();

        } catch (SQLException ex) {
            System.out.println("An Error Occured: " + ex.getMessage());
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------//
//                                               APPOINTMENT - CRUD OPERACIJE                                                                   //
//----------------------------------------------------------------------------------------------------------------------------------------------//
    public void saveAppointment(Appointment appointment) {

        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "insert into appointment (date_time, dog_id, salon_id, fee, duration, treatment_type) values(?,?,?,?,?,?)";

            PreparedStatement prepStatement = conn.prepareStatement(query);

            prepStatement.setTimestamp(1, Timestamp.valueOf(appointment.getDateTime()));
            prepStatement.setLong(2, appointment.getDog().getDogID());
            prepStatement.setLong(3, appointment.getSalon().getSalonID());
            prepStatement.setDouble(4, appointment.getFee());
            prepStatement.setInt(5, appointment.getDuration());
            prepStatement.setString(6, appointment.getTreatmentType().toString().toLowerCase());

            int result = prepStatement.executeUpdate();
            System.out.println("Affected records in table appoinment: " + result);

        } catch (SQLException ex) {
            System.out.println("Desila se greska saveAppointment: " + ex);

        }
    }

    public List<Appointment> getAppointments() {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<Appointment> appointments = new ArrayList<>();

            String query = "SELECT a.id, a.date_time, a.dog_id, a.salon_id, a.fee, a.duration, a.treatment_type, s.id, s.address, d.name, d.breed, p.id, p.firstname, p.lastname, p.contact_number,p.appointment_number, c.zip_code, c.name, pref.discount FROM appointment a JOIN salon s ON a.salon_id=s.id JOIN dog d ON a.dog_id=d.id JOIN person p ON d.person_id=p.id JOIN city c ON c.zip_code=s.city_zip_code LEFT JOIN preferential pref ON p.id=pref.person_id";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Long id = resultSet.getLong("a.id");
                Timestamp sqlTimestamp = resultSet.getTimestamp("a.date_time");
                LocalDateTime dateTime = sqlTimestamp.toLocalDateTime();
                Person person = new Person(resultSet.getLong("p.id"), resultSet.getString("p.firstname"), resultSet.getString("p.lastname"), resultSet.getString("p.contact_number"), resultSet.getInt("p.appointment_number"));
                Dog dog = new Dog(resultSet.getLong("a.dog_id"), person, resultSet.getString("d.name"), resultSet.getString("d.breed"));
                City city = new City(resultSet.getString("c.zip_code"), resultSet.getString("c.name"));
                Salon salon = new Salon(resultSet.getLong("s.id"), resultSet.getString("s.address"), city);
                double fee = resultSet.getDouble("a.fee");
                int duration = resultSet.getInt("a.duration");
                TreatmentType treatmentType = TreatmentType.valueOf(resultSet.getString("a.treatment_type").toUpperCase());

                appointments.add(new Appointment(id, dateTime, dog, salon, fee, duration, treatmentType));
            }
            return appointments;
        } catch (SQLException ex) {
            System.out.println("Desila se greska: " + ex.getMessage());
            return null;
        }
    }
    
    public List<Appointment> getAppointments(Salon salonFilter) {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<Appointment> appointments = new ArrayList<>();

            String query = "SELECT a.id, a.date_time, a.dog_id, a.salon_id, a.fee, a.duration, a.treatment_type, s.id, s.address, d.name, d.breed, p.id, p.firstname, p.lastname, p.contact_number,p.appointment_number, c.zip_code, c.name, pref.discount FROM appointment a JOIN salon s ON a.salon_id=s.id JOIN dog d ON a.dog_id=d.id JOIN person p ON d.person_id=p.id JOIN city c ON c.zip_code=s.city_zip_code LEFT JOIN preferential pref ON p.id=pref.person_id where a.salon_id=" + salonFilter.getSalonID();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Long id = resultSet.getLong("a.id");
                Timestamp sqlTimestamp = resultSet.getTimestamp("a.date_time");
                LocalDateTime dateTime = sqlTimestamp.toLocalDateTime();
                Person person = new Person(resultSet.getLong("p.id"), resultSet.getString("p.firstname"), resultSet.getString("p.lastname"), resultSet.getString("p.contact_number"), resultSet.getInt("p.appointment_number"));
                Dog dog = new Dog(resultSet.getLong("a.dog_id"), person, resultSet.getString("d.name"), resultSet.getString("d.breed"));
                City city = new City(resultSet.getString("c.zip_code"), resultSet.getString("c.name"));
                Salon salon = new Salon(resultSet.getLong("s.id"), resultSet.getString("s.address"), city);
                double fee = resultSet.getDouble("a.fee");
                int duration = resultSet.getInt("a.duration");
                TreatmentType treatmentType = TreatmentType.valueOf(resultSet.getString("a.treatment_type").toUpperCase());

                appointments.add(new Appointment(id, dateTime, dog, salon, fee, duration, treatmentType));
            }
            return appointments;
        } catch (SQLException ex) {
            System.out.println("Desila se greska: " + ex.getMessage());
            return null;
        }
    }

    public void removeAppointment(Long id) {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();

            String query = "delete from appointment where id=" + id;
            Statement s = conn.createStatement();
            s.execute(query);
        } catch (SQLException ex) {
            System.out.println("Desila se greska: " + ex.getMessage());
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------//
    //                                               APPOINTMENT - CRUD OPERACIJE, KRAJ                                                             //
    //----------------------------------------------------------------------------------------------------------------------------------------------//

    //------------------//
    //      USERS       //
    //------------------//
    public List<User> getUsers() {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<User> users = new ArrayList<>();

            String query = "select id, username, password from user";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User(resultSet.getLong("id"), resultSet.getString("username"), resultSet.getString("password"));
                users.add(user);
            }
            return users;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //------------------//
    //      DOGS        //
    //------------------//
    public List<Dog> getDogs() {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<Dog> dogs = new ArrayList<>();

            String query = "SELECT d.id, d.person_id, d.name, d.breed, p.firstname, p.lastname, p.contact_number, p.appointment_number FROM dog d JOIN person p ON d.person_id=p.id";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Long id = resultSet.getLong("d.id");
                Person person = new Person(resultSet.getLong("d.person_id"), resultSet.getString("p.firstname"), resultSet.getString("p.lastname"), resultSet.getString("p.contact_number"), resultSet.getInt("p.appointment_number"));
                String breed = resultSet.getString("d.breed");
                String name = resultSet.getString("d.name");

                dogs.add(new Dog(id, person, name, breed));
            }
            return dogs;
        } catch (SQLException ex) {
            System.out.println("Desila se greska: " + ex.getMessage());
            return null;
        }
    }

    //------------------//
    //      SALONS      //
    //------------------//
    
    public List<Salon> getSalons() {
        try {
            Connection conn = DBConnectionFactory.getInstance().getConnection();
            List<Salon> salons = new ArrayList<>();

            String query = "SELECT s.id, s.address, s.city_zip_code, c.name FROM salon s JOIN city c ON s.city_zip_code=c.zip_code";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Long id = resultSet.getLong("s.id");
                City city = new City(resultSet.getString("s.city_zip_code"), resultSet.getString("c.name"));
                String address = resultSet.getString("s.address");

                salons.add(new Salon(id, address, city));
            }
            return salons;
        } catch (SQLException ex) {
            System.out.println("Desila se greska: " + ex.getMessage());
            return null;
        }
    }

}

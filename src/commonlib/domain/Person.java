/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.domain;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author anavu
 */
public class Person implements Serializable, GenericEntity {

    private Long personID;
    private String firstname;
    private String lastname;
    private String contactNumber;
    private int appointmentNumber;

    public Person() {

    }

    public Person(Long personID, String firstname, String lastname, String contactNumber, int appointmentNumber) {
        this.personID = personID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.appointmentNumber = appointmentNumber;
    }

    public Long getPersonID() {
        return personID;
    }

    public void setPersonID(Long personID) {
        this.personID = personID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFisrtname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAppointment_number() {
        return appointmentNumber;
    }

    public void setAppointment_number(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.personID);
        hash = 59 * hash + Objects.hashCode(this.firstname);
        hash = 59 * hash + Objects.hashCode(this.lastname);
        hash = 59 * hash + Objects.hashCode(this.contactNumber);
        hash = 59 * hash + this.appointmentNumber;
        return hash;
    }


  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.personID, other.personID);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    @Override
    public String getTableName() {
        return "person";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "firstname, lastname, contact_number, appointment_number";
    }

    @Override
    public String getInsertValues() {
        return "'" + firstname + "','"
                + lastname + "','"
                + contactNumber + "',"
                + appointmentNumber;
    }

    // UNSUPPORTED
    @Override
    public String getInsertValuesUnprepared() {
        return null;
    }

    // UNSUPPORTED
    @Override
    public void prepareStatement(PreparedStatement statement) throws SQLException {
    }

    @Override
    public void setID(Long id) {
        personID = id;
    }

    @Override
    public String getSelectCondition() {
        return "id=" + personID;
    }

    @Override
    public String getDeleteCondition() {
        return "id=" + personID;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "id=" + personID;
    }

    @Override
    public String getUpdateCondition() {
        return "id=" + personID;
    }

    @Override
    public String setAttributes() {
        return "firstname='" + firstname
                + "', lastname='" + lastname
                + "', contact_number='" + contactNumber
                + "', appointmentNumber=" + appointmentNumber;
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
         List<GenericEntity> list = new ArrayList<>();
        while(rs.next()){
            Person p = new Person();
            p.setPersonID(rs.getLong("id"));
            p.setFisrtname(rs.getString("firstname"));
            p.setLastname(rs.getString("lastname"));
            p.setContactNumber(rs.getString("contact_number"));
            p.setAppointment_number(rs.getInt("appointment_number"));
            
            list.add(p);
        }
        return list;
    }

    // UNSUPPORTED
    @Override
    public String getSpecificSelectCondition() {
        return "";
    }
}

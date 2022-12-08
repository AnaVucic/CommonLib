/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoggroomingapp.domain;

import java.util.Objects;

/**
 *
 * @author anavu
 */
public class Person {
    private Long personID;
    private String firstname;
    private String lastname;
    private String contactNumber;
    private int appointment_number;
    
    public Person(){
        
    }

    public Person(Long personID, String firstname, String lastname, String contactNumber, int appointment_number) {
        this.personID = personID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.appointment_number = appointment_number;
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
        return appointment_number;
    }

    public void setAppointment_number(int appointment_number) {
        this.appointment_number = appointment_number;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.personID);
        hash = 59 * hash + Objects.hashCode(this.firstname);
        hash = 59 * hash + Objects.hashCode(this.lastname);
        hash = 59 * hash + Objects.hashCode(this.contactNumber);
        hash = 59 * hash + this.appointment_number;
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
        return "Person{" + "personID=" + personID + ", firstname=" + firstname + ", lastname=" + lastname + ", contactNumber=" + contactNumber + ", appointment_number=" + appointment_number + '}';
    }

    

    
    
    
    
}

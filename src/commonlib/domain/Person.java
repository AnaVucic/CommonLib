/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.domain;

import java.util.List;
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
    private int appointmentNumber;
    
    public Person(){
        
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

    

    
    
    
    
}

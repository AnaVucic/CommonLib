/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.domain;

import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Salon {
    
    private Long salonID;
    private String address;
    private City city;

    public Salon() {
    }

    public Salon(Long salonID, String address, City city) {
        this.salonID = salonID;
        this.address = address;
        this.city = city;
    }

    public Long getSalonID() {
        return salonID;
    }

    public void setSalonID(Long salonID) {
        this.salonID = salonID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.salonID);
        hash = 79 * hash + Objects.hashCode(this.address);
        hash = 79 * hash + Objects.hashCode(this.city);
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
        final Salon other = (Salon) obj;
        return Objects.equals(this.salonID, other.salonID);
    }

    @Override
    public String toString() {
        return address + ", " + city.getName();
    }
    
    
    
    
    
}

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
public class Breed {
    
    private Long breedID;
    private String name;

    public Breed() {
    }

    public Breed(Long breedID, String name) {
        this.breedID = breedID;
        this.name = name;
    }

    public Long getBreedID() {
        return breedID;
    }

    public void setBreedID(Long breedID) {
        this.breedID = breedID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.breedID);
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Breed other = (Breed) obj;
        return Objects.equals(this.breedID, other.breedID);
    }

    @Override
    public String toString() {
        return "Breed{" + "breedID=" + breedID + ", name=" + name + '}';
    }
    
    
    
}

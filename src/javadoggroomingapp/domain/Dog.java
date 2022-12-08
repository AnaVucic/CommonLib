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
public class Dog {
    
    private Long dogID;
    private Person person;
    private String name;
    private String breed;
    
    public Dog(){
        
    }

    public Dog(Long dogID, Person person, String name, String breed) {
        this.dogID = dogID;
        this.person = person;
        this.name = name;
        this.breed = breed;
    }

    

    public Long getDogID() {
        return dogID;
    }

    public void setDogID(Long dogID) {
        this.dogID = dogID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dogID);
        hash = 53 * hash + Objects.hashCode(this.person);
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.breed);
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
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.dogID, other.dogID)) {
            return false;
        }
        return Objects.equals(this.person, other.person);
    }

    @Override
    public String toString() {
        return name + ", " + breed + "("+ person.getFirstname() +" "+person.getLastname() +")";
    }

    

    
    

   
}

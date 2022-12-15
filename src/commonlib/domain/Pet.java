/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.domain;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author anavu
 */
public class Pet {
    
    private Person person;
    private Dog dog;
    private LocalDate dateFrom;
    private LocalDate dateTo;
 
    public Pet(){
        
    }

    public Pet(Person person, Dog dog, LocalDate dateFrom, LocalDate dateTo) {
        this.person = person;
        this.dog = dog;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.person);
        hash = 59 * hash + Objects.hashCode(this.dog);
        hash = 59 * hash + Objects.hashCode(this.dateFrom);
        hash = 59 * hash + Objects.hashCode(this.dateTo);
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
        final Pet other = (Pet) obj;
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return Objects.equals(this.dog, other.dog);
    }

    @Override
    public String toString() {
        return "Pet{" + "person=" + person + ", dog=" + dog + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + '}';
    }

    
    
}


package commonlib.domain;

import java.util.Objects;

public class Preferential {
    private Person person;
    private Double discount;

    public Preferential() {
    }

    public Preferential(Person person, Double discount) {
        this.person = person;
        this.discount = discount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.person);
        hash = 89 * hash + Objects.hashCode(this.discount);
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
        final Preferential other = (Preferential) obj;
        return Objects.equals(this.person, other.person);
    }

    @Override
    public String toString() {
        return "Preferential{" + "person=" + person + ", discount=" + discount + '}';
    }
    
    
    
}

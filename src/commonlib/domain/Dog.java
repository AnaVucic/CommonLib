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
public class Dog implements Serializable, GenericEntity{
    
    private Long dogID;
    private Person person;
    private Breed breed;
    private String name;
    
    
    public Dog(){
        
    }

    public Dog(Long dogID, Person person, String name, Breed breed) {
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

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
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

    @Override
    public String getTableName() {
        return "dog";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "person_id, breed_id, name";
    }

    @Override
    public String getInsertValues() {
        return "'" + person.getPersonID() + "', '" +
                breed.getBreedID() + "', '" +
                name + "'";
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
        dogID = id;
    }

    @Override
    public String getSelectCondition() {
        return "person_id="+ person.getPersonID();
    }

    @Override
    public String getDeleteCondition() {
        return "id="+ dogID;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "id="+ dogID;
    }

    @Override
    public String getUpdateCondition() {
        return "id="+ dogID;
    }

    @Override
    public String setAttributes() {
        return "person_id='" + person.getPersonID() + 
                "', breed_id='" + breed.getBreedID() +
                "', name='" + name + "'";
                
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while(rs.next()){
            Dog d = new Dog();
            d.setDogID(rs.getLong("id"));
            
            Person p = new Person();
            p.setPersonID(rs.getLong("person_id"));
            d.setPerson(p);
            
            Breed b = new Breed();
            b.setBreedID(rs.getLong("breed_id"));
            d.setBreed(b);
            
            d.setName(rs.getString("name"));
            
            list.add(d);
        }
        return list;
    }

    // UNSUPPORTED
    @Override
    public String getSpecificSelectCondition() {
        return "";
    }

    

    
    

   
}

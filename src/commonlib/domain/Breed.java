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
 * @author Lenovo
 */
public class Breed implements Serializable, GenericEntity {

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
        return name;
    }

    @Override
    public String getTableName() {
        return "breed";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "id, name";
    }

    @Override
    public String getInsertValues() {
        return "'" + breedID + ", '" + name + "'";
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
        this.breedID = id;
    }

    @Override
    public String getSelectCondition() {
        return "id=" + breedID;
    }

    @Override
    public String getDeleteCondition() {
        return "id=" + breedID;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "id=" + breedID;
    }

    @Override
    public String getUpdateCondition() {
        return "id=" + breedID;
    }

    @Override
    public String setAttributes() {
        return "id='" + breedID + "', name='" + name + "'";
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            Breed b = new Breed();
            b.setBreedID(rs.getLong("id"));
            b.setName(rs.getString("name"));    
            list.add(b);
        }
        return list;
    }

    @Override
    public String getSpecificSelectCondition() {
        return null;
    }

}

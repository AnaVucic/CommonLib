package commonlib.domain;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City implements Serializable, GenericEntity{
    
    private String zipCode;
    private String name;
    
    public City(){
        
    }

    public City(String zipCode, String name) {
        this.zipCode = zipCode;
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.zipCode);
        hash = 73 * hash + Objects.hashCode(this.name);
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
        final City other = (City) obj;
        return Objects.equals(this.zipCode, other.zipCode);
    }

    @Override
    public String toString() {
        return "City{" + "zipCode=" + zipCode + ", name=" + name + '}';
    }

    @Override
    public String getTableName() {
        return "city";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "zip_code, name";
    }

    @Override
    public String getInsertValues() {
        return "'" + zipCode + "', '" + name + "'";
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
        zipCode = String.valueOf(id);
    }

    @Override
    public String getSelectCondition() {
        return "zip_code=" + zipCode;
    }

    @Override
    public String getDeleteCondition() {
        return "zip_code=" + zipCode;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "zip_code=" + zipCode;
    }

    @Override
    public String getUpdateCondition() {
        return "zip_code=" + zipCode;
    }

    @Override
    public String setAttributes() {
        return "zip_code='" + zipCode + "', name='" + name + "'";
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            City c = new City();
            c.setZipCode(rs.getString("zip_code"));
            c.setName(rs.getString("name"));
            list.add(c);
        }
        return list;
    }

    @Override
    public String getSpecificSelectCondition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

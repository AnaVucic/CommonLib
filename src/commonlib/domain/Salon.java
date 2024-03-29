/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Salon implements Serializable, GenericEntity {

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

    @Override
    public String getTableName() {
        return "salon";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "address, city_zip_code";
    }

    @Override
    public String getInsertValues() {
        return "'" + address + "', '" + city.getZipCode() + "'";
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
        salonID = id;
    }

    @Override
    public String getSelectCondition() {
        return "id=" + salonID;
    }

    @Override
    public String getDeleteCondition() {
        return "id=" + salonID;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "id=" + salonID;

    }

    @Override
    public String getUpdateCondition() {
        return "id=" + salonID;

    }

    @Override
    public String setAttributes() {
        return "address='" + address + "', city_zip_code='" + city.getZipCode() + "'";
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            Salon s = new Salon();
            s.setSalonID(rs.getLong("id"));
            s.setAddress(rs.getString("address"));
            City city = new City(rs.getString("city_zip_code"), null);
            s.setCity(city);
            
            System.out.println(city.toString() + "\n" + s.toString());

            list.add(s);
        }
        return list;
    }
    
    // UNSUPPORTED
    @Override
    public String getSpecificSelectCondition() {
        return "";
    }

}

package commonlib.domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Service implements Serializable, GenericEntity {

    private Long serviceID;
    private String name;
    private BigDecimal fee;
    private int duration;
    //private List<Appointment> appointments; //all appointments containing a specific service

    public Service() {

    }

    public Service(Long serviceID, String name, BigDecimal fee, int duration) {
        this.serviceID = serviceID;
        this.name = name;
        this.fee = fee;
        this.duration = duration;
    }

    public Long getServiceID() {
        return serviceID;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public int getDuration() {
        return duration;
    }

    public void setServiceID(Long serviceID) {
        this.serviceID = serviceID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.serviceID);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.fee);
        hash = 97 * hash + this.duration;
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
        final Service other = (Service) obj;
        return Objects.equals(this.serviceID, other.serviceID);
    }

    @Override
    public String toString() {
        return "Service{" + "serviceID=" + serviceID + ", name=" + name + ", fee=" + fee + ", duration=" + duration + '}';
    }

    @Override
    public String getTableName() {
        return "service";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "name, fee, duration";
    }

    @Override
    public String getInsertValues() {
        return "'" + name + "', " + fee + ", " + duration;
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
        this.serviceID = id;
    }

    @Override
    public String getSelectCondition() {
        return "id=" + serviceID;
    }

    @Override
    public String getDeleteCondition() {
        return "id=" + serviceID;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "id=" + serviceID;
    }

    @Override
    public String getUpdateCondition() {
        return "id=" + serviceID;
    }

    @Override
    public String setAttributes() {
        return "name='" + name + ", fee=" + fee + ", duration=" + duration;
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            Service s = new Service();
            s.setServiceID(rs.getLong("id"));
            s.setName(rs.getString("name"));
            s.setFee(rs.getBigDecimal("fee"));
            s.setDuration(rs.getInt("duration"));
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

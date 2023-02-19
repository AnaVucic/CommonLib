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
public class AppointmentService implements Serializable, GenericEntity {

    private Long appointment;
    private Long service;

    public AppointmentService() {
    }

    public AppointmentService(Long appointment, Long service) {
        this.appointment = appointment;
        this.service = service;
    }

    public Long getAppointment() {
        return appointment;
    }

    public void setAppointment(Long appointment) {
        this.appointment = appointment;
    }

    public Long getService() {
        return service;
    }

    public void setService(Long service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.appointment);
        hash = 23 * hash + Objects.hashCode(this.service);
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
        final AppointmentService other = (AppointmentService) obj;
        if (!Objects.equals(this.appointment, other.appointment)) {
            return false;
        }
        return Objects.equals(this.service, other.service);
    }

    @Override
    public String getTableName() {
        return "appointment_service";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "appointment_id, service_id";
    }

    @Override
    public String getInsertValues() {
        return appointment + ", " + service;
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

    // UNSUPPORTED - composite key, cannot take only one Long value, must take two.
    @Override
    public void setID(Long id) {
    }

    @Override
    public String getSelectCondition() {
        return "appointment_id=" + appointment;
    }

    @Override
    public String getDeleteCondition() {
        return "appointment_id=" + appointment + "AND service_id=" + service ;
    }

    @Override
    public String getDeleteConditionForItem() {
        return "appointment_id=" + appointment;
    }

    @Override
    public String getUpdateCondition() {
        return "appointment_id=" + appointment;
    }

    @Override
    public String setAttributes() {
        return "appointment_id=" + appointment + ", service_id=" + service;
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            AppointmentService as = new AppointmentService();
            as.setAppointment(rs.getLong("appointment_id"));
            as.setService(rs.getLong("service_id"));
            list.add(as);
        }
        return list;
    }

    // UNSUPPORTED
    @Override
    public String getSpecificSelectCondition() {
        return "";
    }

}

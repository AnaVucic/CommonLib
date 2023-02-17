package commonlib.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Appointment implements Serializable, GenericEntity {

    private Long appointmentID;
    private LocalDateTime dateTime;
    private Dog dog;
    private Salon salon;
    private BigDecimal totalFee;
    private int totalDuration;
    private List<Service> services;

    public Appointment() {
    }

    public Appointment(Long appointmentID, LocalDateTime dateTime, Dog dog, Salon salon, BigDecimal totalFee, int totalDuration, List<Service> services) {
        this.appointmentID = appointmentID;
        this.dateTime = dateTime;
        this.dog = dog;
        this.salon = salon;
        this.totalFee = totalFee;
        this.totalDuration = totalDuration;
        this.services = services;
    }

    public Long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.appointmentID);
        hash = 23 * hash + Objects.hashCode(this.dateTime);
        hash = 23 * hash + Objects.hashCode(this.dog);
        hash = 23 * hash + Objects.hashCode(this.salon);
        hash = 23 * hash + Objects.hashCode(this.totalFee);
        hash = 23 * hash + Objects.hashCode(this.totalDuration);
        hash = 23 * hash + Objects.hashCode(this.services);
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
        final Appointment other = (Appointment) obj;
        return Objects.equals(this.appointmentID, other.appointmentID);
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentID=" + appointmentID + ", dateTime=" + dateTime
                + ", dog=" + dog + ", salon=" + salon + ", totalFee=" + totalFee
                + ", totalDuration=" + totalDuration + ", services=" + services + '}';
    }

    @Override
    public String getTableName() {
        return "appointment";
    }

    @Override
    public String getColumnNamesForInsert() {
        return "date_time, dog_id, salon_id, total_fee, total_duration";

    }

    @Override
    public String getInsertValues() {
        return "'" + java.sql.Timestamp.valueOf(dateTime) + "', '"
                + dog.getDogID() + "', '" + salon.getSalonID() + "', '"
                + totalFee.doubleValue() + "', '" + totalDuration + "'";
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
        this.appointmentID = id;
    }

    @Override
    public String getSelectCondition() {
        return "id=" + appointmentID;

    }
    
    @Override
    public String getDeleteCondition() {
        return "id=" + appointmentID;

    }

    // nije mi jasno zasto je ovo napravljeno xd
    @Override
    public String getDeleteConditionForItem() {
        return "id=" + appointmentID;
    }

    @Override
    public String getUpdateCondition() {
        return "id=" + appointmentID;
    }

    @Override
    public String setAttributes() {
        return "date_time='" + java.sql.Timestamp.valueOf(dateTime)  + 
                "', dog_id='" + dog.getDogID() + 
                "', salon_id='" + salon.getSalonID() +
                "', total_fee='" + totalFee.doubleValue() +
                "', total_duration='" + totalDuration + "'";
    }

    @Override
    public List<GenericEntity> getList(ResultSet rs) throws Exception {
        List<GenericEntity> list = new ArrayList<>();
        while (rs.next()) {
            Appointment a = new Appointment();
            a.setAppointmentID(rs.getLong("id"));
            a.setDateTime(rs.getTimestamp("date_time").toLocalDateTime());
            a.setTotalFee(BigDecimal.valueOf(rs.getDouble("total_fee")));
            a.setTotalDuration(rs.getInt("total_duration"));
            
            Dog d = new Dog();
            d.setDogID(rs.getLong("dog_id"));
            a.setDog(d);
            
            Salon s = new Salon();
            s.setSalonID(rs.getLong("salon_id"));
            a.setSalon(s);

            list.add(a);
        }
        return list;
    }

    // UNSUPPORTED
    @Override
    public String getSpecificSelectCondition() {
        return "";
    }

}

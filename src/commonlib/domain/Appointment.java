package commonlib.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author anavu
 */
public class Appointment {
    
    private Long appointmentID;
    private LocalDateTime dateTime;
    private Dog dog;
    private Salon salon;
    private BigDecimal totalFee;
    private BigDecimal totalDuration;
    private List<Service> appointmentsTreatmentTypes;

    public Appointment() {
    }

    public Appointment(Long appointmentID, LocalDateTime dateTime, Dog dog, Salon salon, BigDecimal totalFee, BigDecimal totalDuration, List<Service> appointmentsTreatmentTypes) {
        this.appointmentID = appointmentID;
        this.dateTime = dateTime;
        this.dog = dog;
        this.salon = salon;
        this.totalFee = totalFee;
        this.totalDuration = totalDuration;
        this.appointmentsTreatmentTypes = appointmentsTreatmentTypes;
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

    public BigDecimal getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(BigDecimal totalDuration) {
        this.totalDuration = totalDuration;
    }

    public List<Service> getAppointmentsTreatmentTypes() {
        return appointmentsTreatmentTypes;
    }

    public void setAppointmentsTreatmentTypes(List<Service> appointmentsTreatmentTypes) {
        this.appointmentsTreatmentTypes = appointmentsTreatmentTypes;
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
        hash = 23 * hash + Objects.hashCode(this.appointmentsTreatmentTypes);
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
        return "Appointment{" + "appointmentID=" + appointmentID + ", dateTime=" + dateTime + ", dog=" + dog + ", salon=" + salon + ", totalFee=" + totalFee + ", totalDuration=" + totalDuration + ", appointmentsTreatmentTypes=" + appointmentsTreatmentTypes + '}';
    }
    
    

}

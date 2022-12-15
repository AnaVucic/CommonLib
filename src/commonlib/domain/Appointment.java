package commonlib.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author anavu
 */
public class Appointment {
    
    private Long appointmentId;
    private LocalDateTime dateTime;
    private Dog dog;
    private Salon salon;
    private double fee;
    private int duration;
    private TreatmentType treatmentType;

    public Appointment() {
    }

    public Appointment(Long appointmentId, LocalDateTime dateTime, Dog dog, Salon salon, double fee, int duration, TreatmentType treatmentType) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.dog = dog;
        this.salon = salon;
        this.fee = fee;
        this.duration = duration;
        this.treatmentType = treatmentType;
    }

    

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
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

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.appointmentId);
        hash = 53 * hash + Objects.hashCode(this.dateTime);
        hash = 53 * hash + Objects.hashCode(this.dog);
        hash = 53 * hash + Objects.hashCode(this.salon);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.fee) ^ (Double.doubleToLongBits(this.fee) >>> 32));
        hash = 53 * hash + this.duration;
        hash = 53 * hash + Objects.hashCode(this.treatmentType);
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
        return Objects.equals(this.appointmentId, other.appointmentId);
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentId=" + appointmentId + ", dateTime=" + dateTime + ", dog=" + dog + ", salon=" + salon + ", fee=" + fee + ", duration=" + duration + ", treatmentType=" + treatmentType + '}';
    }

    
    
    
    
    

    
    
    
}

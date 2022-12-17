package commonlib.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Service {

    private Long serviceID;
    private String name;
    private BigDecimal fee;
    private int duration;

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

}

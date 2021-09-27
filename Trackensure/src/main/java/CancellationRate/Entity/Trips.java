package CancellationRate.Entity;

import CancellationRate.Enum.StatusEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "trips")
public class Trips {

    @Id
    private Integer id;
    private Integer client_id;
    private Integer driver_id;
    private Integer city_id;
    private StatusEnum status;
    private Date requestAt;

    public Trips() {
    }

    public Trips(Integer id, Integer client_id, Integer driver_id, Integer city_id, StatusEnum status, Date requestAt) {
        this.id = id;
        this.client_id = client_id;
        this.driver_id = driver_id;
        this.city_id = city_id;
        this.status = status;
        this.requestAt = requestAt;
    }

    public Integer getId() {
        return id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getRequestAt() {
        return requestAt;
    }

    public void setRequestAt(Date requestAt) {
        this.requestAt = requestAt;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", driver_id=" + driver_id +
                ", city_id=" + city_id +
                ", status=" + status +
                ", requestAt=" + requestAt +
                '}';
    }
}

package CancellationRate.Entity;

import CancellationRate.Dto.CancellationRateDto;
import CancellationRate.Enum.BannedStatusEnum;
import CancellationRate.Enum.RoleEnum;

import javax.persistence.*;

@NamedNativeQuery(name = "Users.cancellationRate",
        query = "SELECT trips.request_at, Round(SUM(rate.can) / SUM(rate.comp), 2) as 'cancellationRate' FROM (SELECT request_at, " +
                "    CASE " +
                "           WHEN trips.status = trips.status THEN 1 " +
                "           ELSE 0 " +
                "           END comp, " +
                "    CASE " +
                "       WHEN trips.status IN('cancelled_by_client', 'cancelled_by_driver') THEN 1 " +
                "       ELSE 0 " +
                "       END AS can " +
                "       FROM trips " +
                "       join users " +
                "       ON trips.client_id = users.users_id " +
                "       WHERE users.banned = 'no') rate " +
                "       GROUP BY rate.request_at",
        resultSetMapping = "Mapping.CancellationRateDto")
@SqlResultSetMapping(name = "Mapping.CancellationRateDto",
        classes = @ConstructorResult(targetClass = CancellationRateDto.class,
                columns = {@ColumnResult(name = "request_at"),
                        @ColumnResult(name = "cancellationRate")}))
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer users_id;
    private BannedStatusEnum banned;
    private RoleEnum role;

    public Users() {
    }

    public Users(Integer users_id, BannedStatusEnum banned, RoleEnum role) {
        this.users_id = users_id;
        this.banned = banned;
        this.role = role;
    }

    public Integer getUsers_id() {
        return users_id;
    }

    public BannedStatusEnum getBanned() {
        return banned;
    }

    public void setBanned(BannedStatusEnum banned) {
        this.banned = banned;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users_id=" + users_id +
                ", banned=" + banned +
                ", role=" + role +
                '}';
    }
}

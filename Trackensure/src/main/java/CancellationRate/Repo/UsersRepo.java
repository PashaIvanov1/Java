package CancellationRate.Repo;

import CancellationRate.Dto.CancellationRateDto;
import CancellationRate.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepo extends JpaRepository<Users, Integer> {

        @Query(nativeQuery = true)
        CancellationRateDto cancellationRate();
}



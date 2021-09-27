package CancellationRate.Service;

import CancellationRate.Dto.CancellationRateDto;
import CancellationRate.Repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancellationRate {

    @Autowired
    private UsersRepo repo;

    public CancellationRate(UsersRepo repo) {
        this.repo = repo;
    }

    public CancellationRateDto calculateCancellationRate() {
        CancellationRateDto cancellationRateDto = repo.cancellationRate();
        return cancellationRateDto;
    }
}

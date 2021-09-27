package CancellationRate.Dto;

public class CancellationRateDto {

    private String request_at;
    private Double cancellationRate;

    public CancellationRateDto() {
    }

    public CancellationRateDto(String request_at, Double cancellationRate) {
        this.request_at = request_at;
        this.cancellationRate = cancellationRate;
    }

    public String getRequest_at() {
        return request_at;
    }

    public void setRequest_at(String request_at) {
        this.request_at = request_at;
    }

    public Double getCancellationRate() {
        return cancellationRate;
    }

    public void setCancellationRate(Double cancellationRate) {
        this.cancellationRate = cancellationRate;
    }
}

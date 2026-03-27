package clima.springClima.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaDados {

    private double latitude;
    private double longitude;
    private String timezone;

    @JsonProperty("current")
    private ClimaAtual climaAtual;

    // getters e setters

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ClimaAtual getClimaAtual() {
        return climaAtual;
    }

    public void setClimaAtual(ClimaAtual climaAtual) {
        this.climaAtual = climaAtual;
    }
}
package clima.springClima.service;

import clima.springClima.model.ClimaDados;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    public ClimaDados buscarClima(double lat, double lon) {

        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + lat +
                "&longitude=" + lon +
                "&current=temperature_2m,windspeed_10m,weathercode&timezone=America/Sao_Paulo";

        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(url, String.class);

        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(json, ClimaDados.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // traduz weathercode
    public String descricaoClima(int code) {

        if (code == 0) return "Céu limpo";
        if (code >= 1 && code <= 3) return "Parcialmente nublado";
        if (code >= 45 && code <= 48) return "Neblina";
        if (code >= 61 && code <= 67) return "Chuva";
        if (code >= 71 && code <= 77) return "Neve";
        if (code >= 80 && code <= 82) return "Pancadas de chuva";

        return "Desconhecido";
    }
}
package atividade04.spring.service;

import atividade04.spring.model.Pais;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaisService {

    private final String URL = "https://restcountries.com/v3.1/name/";

    public Pais buscarPais(String nome) {

        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(URL + nome, String.class);

        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode root = mapper.readTree(json).get(0);

            Pais pais = new Pais();

            pais.setNomeComum(root.path("name").path("common").asText());
            pais.setNomeOficial(root.path("name").path("official").asText());

            // capital é array
            pais.setCapital(root.path("capital").get(0).asText());

            pais.setRegiao(root.path("region").asText());
            pais.setSubRegiao(root.path("subregion").asText());
            pais.setPopulacao(root.path("population").asLong());
            pais.setArea(root.path("area").asDouble());

            pais.setBandeira(root.path("flags").path("png").asText());

            return pais;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
package main.java.BuscaCEp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SistemaCep {
    private ArrayList<Endereco> listarEnderecos = new ArrayList<>();
    private HttpClient cliente = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public Endereco buscarEndereco(String cep) throws Exception {
        for (Endereco e : listarEnderecos) {
            if (e.cep.equals(cep)) {
                return e;
            }
        }

        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.body().contains("\"erro\"")) {
            return null;
        }

        Endereco endereco = mapper.readValue(response.body(), Endereco.class);
        listarEnderecos.add(endereco);
        return endereco;
    }

    public boolean excluirEndereco(String cep) {
        return listarEnderecos.removeIf(e -> e.cep.equals(cep));
    }
    public ArrayList<Endereco> getHistorico() {
        return listarEnderecos;
    }
}

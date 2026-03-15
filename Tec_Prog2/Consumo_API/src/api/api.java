import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class api{
    public Empresa buscarEmpresa(string cnpj) throws Exception{
        String url = "https://brasilapi.com.br/api/cnpj/v1" + cnpj;

        HttpRequest cliente = HttpCliente.newHttpCliente();
        HttpRequest request = HttpRequest.newBuilder();
            .uri(URI.create(url))
                .GET()
                .build();

         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

         String json = response.body();

         Gson gson = new Gson();

         Empresa empresa = gson.fromJson(json, Empresa.class);

         return empresa;

    }
}
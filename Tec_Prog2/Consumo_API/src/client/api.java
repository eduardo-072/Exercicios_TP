package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import model.Empresa;

public class api {

    // client/api.java
    public Empresa consultarCnpj(String cnpj) {
        Empresa empresa = null;
        String url = "https://brasilapi.com.br/api/cnpj/v1/" + cnpj;

        try {
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");

            int status = con.getResponseCode();
            if (status == 200) {
                String json = lerResposta(con); // método que retorna String da API
                empresa = gson.fromJson(json, Empresa.class);
            } else {
                System.out.println("CNPJ não encontrado ou inválido: " + status);
            }
        } catch (IOException e) {
            System.out.println("Erro de conexão com a API: " + e.getMessage());
        }

        return empresa;
    }
    }
}
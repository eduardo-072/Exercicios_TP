package main.java.BuscaCEp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Endereco {
    public String cep;
    public String logradouro;
    public String bairro;
    public String localidade;
    public String uf;

    @Override
    public String toString(){
        return "CEP: " + cep + " " +
               "Logradouro: " + logradouro + " " +
               "Bairro: " + bairro + " " +
               "Cidade: " + localidade + " " +
               "UF: " + uf + " ";
    }
}

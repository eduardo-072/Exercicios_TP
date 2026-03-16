package model;

import com.google.gson.annotations.SerializedName;

public class Socio {

    @SerializedName("nome_socio")
    private String nomeSocio;

    @SerializedName("cnpj_cpf_do_socio")
    private String cnpjCpfSocio;

    @SerializedName("qualificacao_socio")
    private String qualificacaoSocio;

    public Socio() {
    }

    public String getNomeSocio() {
        return nomeSocio;
    }
    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    public String getCnpjCpfSocio() {
        return cnpjCpfSocio;
    }
    public void setCnpjCpfSocio(String cnpjCpfSocio) {
        this.cnpjCpfSocio = cnpjCpfSocio;
    }

    public String getQualificacaoSocio() {
        return qualificacaoSocio;
    }
    public void setQualificacaoSocio(String qualificacaoSocio) {
        this.qualificacaoSocio = qualificacaoSocio;
    }
}
package com.grupo14.companhia_aerea.dominio;

import javax.persistence.Entity;

@Entity
public class CompanhiaAerea extends EntidadeBase{

    private String nome;
    private String codigoICAO;
    private String pais;

    public CompanhiaAerea() {}

    public CompanhiaAerea(String nome, String codigoICAO, String pais) {
        this.nome = nome;
        this.codigoICAO = codigoICAO;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoICAO() {
        return codigoICAO;
    }

    public void setCodigoICAO(String codigoICAO) {
        this.codigoICAO = codigoICAO;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

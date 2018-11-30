package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.EntidadeBase;

import javax.persistence.Entity;

@Entity
public class Aeroporto extends EntidadeBase {
    private String nome;
    private String cidade;
    private String pais;
    private String codigoIATA;

    public Aeroporto(){}

    public Aeroporto(String nome, String cidade, String pais, String codigoIATA) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.codigoIATA = codigoIATA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }
}

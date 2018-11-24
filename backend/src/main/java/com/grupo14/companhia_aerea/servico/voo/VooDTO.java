package com.grupo14.companhia_aerea.servico.voo;

import com.grupo14.companhia_aerea.dominio.voo.Assento;

import java.util.List;

public class VooDTO {
    private String cidadeDeOrigem;
    private String cidadeDeDestino;
    private String dataDeIda;
    private String dataDeVolta;
    private List<Assento> assentos;

    public VooDTO() {
    }

    public String getCidadeDeOrigem() {
        return cidadeDeOrigem;
    }

    public void setCidadeDeOrigem(String cidadeDeOrigem) {
        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public String getCidadeDeDestino() {
        return cidadeDeDestino;
    }

    public void setCidadeDeDestino(String cidadeDeDestino) {
        this.cidadeDeDestino = cidadeDeDestino;
    }

    public String getDataDeIda() {
        return dataDeIda;
    }

    public void setDataDeIda(String dataDeIda) {
        this.dataDeIda = dataDeIda;
    }

    public String getDataDeVolta() {
        return dataDeVolta;
    }

    public void setDataDeVolta(String dataDeVolta) {
        this.dataDeVolta = dataDeVolta;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
}

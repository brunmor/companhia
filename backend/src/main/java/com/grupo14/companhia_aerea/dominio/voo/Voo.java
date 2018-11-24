package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.EntidadeBase;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Voo extends EntidadeBase {

    private String cidadeDeOrigem;
    private String cidadeDeDestino;
    private LocalDate dataDeIda;
    private LocalDate dataDeVolta;
    private List<Assento> assentos;

    public Voo(String cidadeDeOrigem, String cidadeDeDestino, LocalDate dataDeIda, LocalDate dataDeVolta) {

        this.cidadeDeOrigem = cidadeDeOrigem;

        this.cidadeDeDestino = cidadeDeDestino;

        this.dataDeIda = dataDeIda;

        this.dataDeVolta = dataDeVolta;

        this.assentos = new ArrayList<>();

        for (int i = 0; i < 60; i++){
            assentos.add(new Assento(false, i));
        }
    }

    public String getCidadeDeOrigem() {
        return this.cidadeDeOrigem;
    }

    public String getCidadeDeDestino() {
        return this.cidadeDeDestino;
    }

    public LocalDate getDataDeIda() {
        return this.dataDeIda;
    }

    public LocalDate getDataDeVolta() {
        return this.dataDeVolta;
    }

    public List<Assento> getAssentos() {
        return this.assentos;
    }

    private class Assento {
        boolean ocupado;
        int codigoDoAssento;

        Assento(boolean ocupado, int codigoDoAssento){
            this.ocupado = ocupado;
            this.codigoDoAssento = codigoDoAssento;
        }
    }
}

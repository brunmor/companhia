package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.EntidadeBase;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Voo extends EntidadeBase {

    private String cidadeDeOrigem;
    private String cidadeDeDestino;
    private LocalDate dataDeIda;
    private LocalDate dataDeVolta;
    private double preco;
    @ElementCollection
    @CollectionTable(joinColumns=@JoinColumn())
//    @AttributeOverride(name="streetAddress", column=@Column(name="STREET_ADDRESS"))
    private List<Assento> assentos;

    public Voo() {
    }

    public Voo(String cidadeDeOrigem, String cidadeDeDestino, LocalDate dataDeIda, LocalDate dataDeVolta, double preco) {

        this.cidadeDeOrigem = cidadeDeOrigem;

        this.cidadeDeDestino = cidadeDeDestino;

        this.dataDeIda = dataDeIda;

        this.dataDeVolta = dataDeVolta;

        this.assentos = new ArrayList<>();

        for (int i = 0; i < 60; i++){
            assentos.add(new Assento(false, i));
        }

        this.preco = preco;
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

    public double getPreco() { return this.preco; }

}

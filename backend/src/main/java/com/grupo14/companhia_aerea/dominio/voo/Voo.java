package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import com.grupo14.companhia_aerea.dominio.EntidadeBase;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Voo extends EntidadeBase {

    @ElementCollection
    @CollectionTable(joinColumns=@JoinColumn())
    private List<Assento> assentos;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "origem_id")
    private Aeroporto origem;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "destino_id")
    private Aeroporto destino;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "companhiaAerea_id")
    private CompanhiaAerea companhiaAerea;

    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;

    public Voo() {}

    public Voo(Aeroporto origem, Aeroporto destino, Date dataDeIda, double valorPorAdulto,
               double valorPorCrianca, CompanhiaAerea companhiaAerea) {
        this.origem = origem;
        this.destino = destino;
        this.dataDeIda = dataDeIda;
        this.valorPorAdulto = valorPorAdulto;
        this.valorPorCrianca = valorPorCrianca;
        this.companhiaAerea = companhiaAerea;
        this.assentos = instanciarAssentos();
    }

    private List<Assento> instanciarAssentos() {
        List<Assento> assentos = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            assentos.add(new Assento(false, i));
        }
        return assentos;
    }


    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Date getDataDeIda() {
        return dataDeIda;
    }

    public void setDataDeIda(Date dataDeIda) {
        this.dataDeIda = dataDeIda;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }

    public double getValorPorAdulto() {
        return valorPorAdulto;
    }

    public void setValorPorAdulto(double valorPorAdulto) {
        this.valorPorAdulto = valorPorAdulto;
    }

    public double getValorPorCrianca() {
        return valorPorCrianca;
    }

    public void setValorPorCrianca(double valorPorCrianca) {
        this.valorPorCrianca = valorPorCrianca;
    }

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
}

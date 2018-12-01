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

    @ManyToOne
    @JoinColumn(name = "origem_id")
    private Aeroporto origem;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Aeroporto destino;

    @ManyToOne
    @JoinColumn(name = "companhiaAerea_id")
    private CompanhiaAerea companhiaAerea;

    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;
    private int numeroDeAdultos;
    private int numeroDeCriancas;
    private double precoTotal;

    public Voo() {}

    public Voo(Aeroporto origem, Aeroporto destino, Date dataDeIda, double valorPorAdulto,
               double valorPorCrianca, int numeroDeAdultos, int numeroDeCriancas, CompanhiaAerea companhiaAerea) {
        this.origem = origem;
        this.destino = destino;
        this.dataDeIda = dataDeIda;
        this.valorPorAdulto = valorPorAdulto;
        this.valorPorCrianca = valorPorCrianca;
        this.numeroDeAdultos = numeroDeAdultos;
        this.numeroDeCriancas = numeroDeCriancas;
        this.companhiaAerea = companhiaAerea;
        this.precoTotal = calcularPrecoTotal();
        this.assentos = instanciarAssentos();
    }

    private double calcularPrecoTotal() {
        double valorDosAdultos = getValorPorAdulto() * getNumeroDeAdultos();
        double valorDasCriancas = getValorPorCrianca() * getNumeroDeCriancas();
        return valorDosAdultos + valorDasCriancas;
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

    public int getNumeroDeAdultos() {
        return numeroDeAdultos;
    }

    public void setNumeroDeAdultos(int numeroDeAdultos) {
        this.numeroDeAdultos = numeroDeAdultos;
    }

    public int getNumeroDeCriancas() {
        return numeroDeCriancas;
    }

    public void setNumeroDeCriancas(int numeroDeCriancas) {
        this.numeroDeCriancas = numeroDeCriancas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }
}

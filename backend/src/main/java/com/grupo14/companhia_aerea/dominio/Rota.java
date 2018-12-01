package com.grupo14.companhia_aerea.dominio;

import com.grupo14.companhia_aerea.dominio.voo.Voo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rota extends EntidadeBase{

    @ManyToOne
    @JoinColumn(name = "ida_id")
    private Voo vooIda;

    @ManyToOne
    @JoinColumn(name = "volta_id")
    private Voo vooVolta;

    private int numeroDeAdultos;
    private int numeroDeCriancas;
    private double preco;

    public Rota() {}

    public Rota(Voo vooIda, Voo vooVolta, int numeroDeAdultos, int numeroDeCriancas) {
        this.vooIda = vooIda;
        this.vooVolta = vooVolta;
        this.numeroDeAdultos = numeroDeAdultos;
        this.numeroDeCriancas = numeroDeCriancas;
        calcularPrecoTotal();
    }

    public Rota(Voo vooIda, int numeroDeAdultos, int numeroDeCriancas) {
        this.vooIda = vooIda;
        this.numeroDeAdultos = numeroDeAdultos;
        this.numeroDeCriancas = numeroDeCriancas;
        calcularPrecoTotal();
    }

    public void calcularPrecoTotal() {
        double precoIda = this.numeroDeAdultos * this.vooIda.getValorPorAdulto();
        precoIda += this.numeroDeCriancas * this.vooIda.getValorPorCrianca();
        double precoVolta = 0;
        if (vooVolta != null) {
            precoVolta = this.numeroDeAdultos * this.vooVolta.getValorPorAdulto();
            precoVolta += this.numeroDeCriancas * this.vooVolta.getValorPorCrianca();
        }

        this.preco = precoIda + precoVolta;
    }

    public Voo getVooIda() {
        return vooIda;
    }

    public void setVooIda(Voo vooIda) {
        this.vooIda = vooIda;
    }

    public Voo getVooVolta() {
        return vooVolta;
    }

    public void setVooVolta(Voo vooVolta) {
        this.vooVolta = vooVolta;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

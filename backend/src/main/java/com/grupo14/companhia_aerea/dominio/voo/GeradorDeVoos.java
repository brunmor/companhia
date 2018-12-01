package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;

import java.util.Date;

public class GeradorDeVoos {

    private Aeroporto origem;
    private Aeroporto destino;
    private CompanhiaAerea companhiaAerea;
    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;

    public GeradorDeVoos() {}

    public void gerarAeroportoDeOrigem() {

    }

    public void gerarAeroportoDeDestino() {

    }

    public void gerarDataDeIda() {

    }

    public void gerarValorParaAdulto() {

    }

    public void gerarValorParaCrianca() {

    }

    public void gerarCompanhiaAerea() {

    }

    public Voo criarVoo() {
        gerarAeroportoDeOrigem();
        gerarAeroportoDeDestino();
        gerarDataDeIda();
        gerarValorParaAdulto();
        gerarValorParaCrianca();
        gerarCompanhiaAerea();
        return new Voo(this.origem, this.destino, this.dataDeIda,
                this.valorPorAdulto, this.valorPorCrianca, this.companhiaAerea);
    }
}

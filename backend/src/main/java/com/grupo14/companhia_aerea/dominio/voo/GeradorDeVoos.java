package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;

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
        this.valorPorAdulto = gerarValorEmDinheiroAleatorio();
    }

    public void gerarValorParaCrianca() {
        this.valorPorCrianca = gerarValorEmDinheiroAleatorio();
    }

    public void gerarCompanhiaAerea() {

    }

    public double gerarValorEmDinheiroAleatorio() {
        Random gerador = new Random();
        DecimalFormat df = new DecimalFormat("0.00");
        double tetoDoValorGerado = 5000;
        String valorEmString = df.format(gerador.nextDouble() * tetoDoValorGerado);
        valorEmString = valorEmString.replace(",", ".");
        return Double.parseDouble(valorEmString);
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

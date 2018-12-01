package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoService;
import com.grupo14.companhia_aerea.servico.companhiaAerea.CompanhiaAereaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DecimalFormat;
import java.util.*;

public class GeradorDeVoos {

    private final CompanhiaAereaService companhiaService;
    private final AeroportoService aeroportoService;

    private Aeroporto origem;
    private Aeroporto destino;
    private CompanhiaAerea companhiaAerea;
    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;

    private Random gerador;

    @Autowired
    public GeradorDeVoos(CompanhiaAereaService companhiaService, AeroportoService aeroportoService)  {
        this.companhiaService = companhiaService;
        this.aeroportoService = aeroportoService;
        this.gerador = new Random();
    }

    public GeradorDeVoos(){
        aeroportoService = null;
        companhiaService = null;
        this.gerador = new Random();
    }

    public void gerarAeroportoDeOrigem() {
        List<Aeroporto> origens;
        origens = aeroportoService.buscarTodos();
        this.origem = origens.get(gerador.nextInt(origens.size()));
    }

    public void gerarAeroportoDeDestino() {
        List<Aeroporto> destinos;
        destinos = aeroportoService.buscarTodos();
        this.destino = destinos.get(gerador.nextInt(destinos.size()));
    }

    public void gerarDataDeIda() {
        int ano = 2019;
        int diaGerado = gerador.nextInt(28);
        int mesGerado = gerador.nextInt(12);
        Calendar calendar = new GregorianCalendar(ano, mesGerado, diaGerado);
        this.dataDeIda = calendar.getTime();
    }

    public void gerarValorParaAdulto() {
        this.valorPorAdulto = gerarValorEmDinheiroAleatorio();
    }

    public void gerarValorParaCrianca() {
        this.valorPorCrianca = gerarValorEmDinheiroAleatorio();
    }

    public void gerarCompanhiaAerea() {
        List<CompanhiaAerea> companhias;
        companhias = companhiaService.buscarTodas();
        this.companhiaAerea = companhias.get(gerador.nextInt(companhias.size()));
    }

    public double gerarValorEmDinheiroAleatorio() {
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

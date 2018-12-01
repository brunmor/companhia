package com.grupo14.companhia_aerea.dominio.voo;


import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class VooTest {

    private List<Assento> assentos;
    private Aeroporto origem;
    private Aeroporto destino;
    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;
    private int numeroDeAdultos;
    private int numeroDeCriancas;
    private double precoTotal;
    private CompanhiaAerea companhiaAerea;

    @Before
    public void iniciar(){
        origem = new Aeroporto("Santos Dumont", "Campo Grande", "Brasil", "SDM");
        destino = new Aeroporto("Aeroporto top", "Cidade Massa", "Pais legal", "ATP");
        dataDeIda = new Date();
        System.out.println(dataDeIda);
        valorPorAdulto = 300.0;
        valorPorCrianca = 180.0;
        numeroDeAdultos = 2;
        numeroDeCriancas = 2;
        companhiaAerea = new CompanhiaAerea("Infraero", "IFA", "Brasil");
    }

    @Test
    public void deve_ter_aeroporto_de_origem() {
        String nomeEsperado = "Santos Dumont";

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, numeroDeAdultos, numeroDeCriancas, companhiaAerea);

        assertEquals(nomeEsperado, voo.getOrigem().getNome());
    }

    @Test
    public void deve_ter_lista_de_assentos(){
        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, numeroDeAdultos, numeroDeCriancas, companhiaAerea);

        assertNotNull (voo.getAssentos());
    }

}

package com.grupo14.companhia_aerea.dominio.voo;


import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VooTest {

    private List<Assento> assentos;
    private Aeroporto origem;
    private Aeroporto destino;
    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;
    private CompanhiaAerea companhiaAerea;

    @Before
    public void iniciar(){
        origem = new Aeroporto("Santos Dumont", "Campo Grande", "Brasil", "SDM");
        destino = new Aeroporto("Aeroporto top", "Cidade Massa", "Pais legal", "ATP");
        dataDeIda = new Date();
        valorPorAdulto = 300.0;
        valorPorCrianca = 180.0;
        companhiaAerea = new CompanhiaAerea("Infraero", "IFA", "Brasil");
    }

    @Test
    public void deve_ter_aeroporto_de_origem() {
        String nomeEsperado = "Santos Dumont";

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, companhiaAerea);

        assertEquals(nomeEsperado, voo.getOrigem().getNome());
    }

    @Test
    public void deve_ter_aeroporto_de_destino() {
        String nomeEsperado = "Aeroporto top";

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, companhiaAerea);

        assertEquals(nomeEsperado, voo.getDestino().getNome());
    }

    @Test
    public void deve_ter_lista_de_assentos(){
        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, companhiaAerea);

        assertNotNull (voo.getAssentos());
    }

    @Test
    public void deve_ter_data_de_ida() {
        Date dataEsperada = dataDeIda;

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, companhiaAerea);

        assertEquals(dataEsperada, voo.getDataDeIda());
    }

    @Test
    public void deve_ter_valor_por_adulto() {
        double valorEsperado = 10.0;

        Voo voo = new Voo(origem, destino, dataDeIda, valorEsperado, valorPorCrianca, companhiaAerea);

        assertEquals(valorEsperado, voo.getValorPorAdulto(), 0);
    }

    @Test
    public void deve_ter_valor_por_crianca() {
        double valorEsperado = 50.6;

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorEsperado, companhiaAerea);

        assertEquals(valorEsperado, voo.getValorPorCrianca(), 0);
    }

    @Test
    public void deve_ter_compania_aerea() {
        String nomeEsperado = "Infraero";

        Voo voo = new Voo(origem, destino, dataDeIda, valorPorAdulto, valorPorCrianca, companhiaAerea);

        assertEquals(nomeEsperado, voo.getCompanhiaAerea().getNome());
    }

}

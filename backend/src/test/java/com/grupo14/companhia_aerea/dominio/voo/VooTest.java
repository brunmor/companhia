package com.grupo14.companhia_aerea.dominio.voo;


import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class VooTest {

    private String cidadeDeOrigem, cidadeDeDestino;
    private LocalDate dataDeIda, dataDeVolta;

    @Before
    public void iniciar(){
        cidadeDeOrigem = "Campo Grande";
        cidadeDeDestino = "Porto Alegre";
        dataDeIda = LocalDate.now();
        dataDeVolta = LocalDate.now();
    }

    @Test
    public void deve_ter_cidade_de_destino(){
        String cidadeDeDestinoEsperada = "São José do Rio Preto";

        Voo voo = new Voo(cidadeDeOrigem, cidadeDeDestinoEsperada, dataDeIda, dataDeVolta);

        assert (cidadeDeDestinoEsperada.equals(voo.getCidadeDeDestino()));
    }

    @Test
    public void deve_ter_data_de_ida(){
        LocalDate dataDeIdaEsperada = LocalDate.now();

        Voo voo = new Voo(cidadeDeOrigem, cidadeDeDestino, dataDeIdaEsperada, dataDeVolta);

        assert (dataDeIdaEsperada == voo.getDataDeIda());
    }

    @Test
    public void deve_ter_data_de_volta(){
        LocalDate dataDeVoltaEsperada = LocalDate.now();

        Voo voo = new Voo(cidadeDeOrigem, cidadeDeDestino, dataDeIda, dataDeVoltaEsperada);

        assert(dataDeVoltaEsperada == voo.getDataDeVolta());
    }

    @Test
    public void deve_ter_lista_de_assentos(){
        Voo voo = new Voo(cidadeDeOrigem, cidadeDeDestino, dataDeIda, dataDeVolta);

        assertNotNull (voo.getAssentos());
    }

    @Test
    public void deve_conter_cidade_de_origem(){
        String cidadeDeOrigemEsperado = "Campo Grande";

        Voo voo = new Voo(cidadeDeOrigemEsperado, cidadeDeDestino, dataDeIda, dataDeVolta);

        assert (voo.getCidadeDeOrigem().equals(cidadeDeOrigemEsperado));
    }

}

package com.grupo14.companhia_aerea.dominio.voo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorDeVoosTest {

    @Test
    public void gerarValorParaAdulto() {
        GeradorDeVoos gerador = new GeradorDeVoos();
        gerador.gerarValorParaAdulto();
    }
}
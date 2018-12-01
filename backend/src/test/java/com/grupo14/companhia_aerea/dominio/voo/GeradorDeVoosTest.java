package com.grupo14.companhia_aerea.dominio.voo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeradorDeVoosTest {

    @Test
    public void gerarDataDeIda() {
        GeradorDeVoos geradorDeVoos = new GeradorDeVoos();
        geradorDeVoos.gerarDataDeIda();
    }
}
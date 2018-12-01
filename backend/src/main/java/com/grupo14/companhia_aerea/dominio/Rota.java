package com.grupo14.companhia_aerea.dominio;

import com.grupo14.companhia_aerea.dominio.voo.Voo;

import javax.persistence.Entity;


public class Rota extends EntidadeBase{

    private Voo vooIda;
    private Voo vooVolta;
    private double preco;
}

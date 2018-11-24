package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.dominio.EntidadeBase;

import javax.persistence.Entity;

@Entity
public class Voo extends EntidadeBase {
    private String cidadeDeOrigem;

    public Voo(String cidadeDeOrigem) {

        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public String getCidadeDeOrigem() {
        return this.cidadeDeOrigem;
    }
}

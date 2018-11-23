package com.grupo14.companhia_aerea.dominio;

public class Voo {
    private String cidadeDeOrigem;

    public Voo(String cidadeDeOrigem) {

        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public String getCidadeDeOrigem() {
        return this.cidadeDeOrigem;
    }
}

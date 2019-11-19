package com.grupo14.companhia_aerea.dominio.voo;

import javax.persistence.Embeddable;

@Embeddable
public class Assento {

    private boolean ocupado;
    private int codigoDoAssento;

    public Assento() {
    }

    public Assento(boolean ocupado, int codigoDoAssento) {
        this.ocupado = ocupado;
        this.codigoDoAssento = codigoDoAssento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getCodigoDoAssento() {
        return codigoDoAssento;
    }

    public void setCodigoDoAssento(int codigoDoAssento) {
        this.codigoDoAssento = codigoDoAssento;
    }
}

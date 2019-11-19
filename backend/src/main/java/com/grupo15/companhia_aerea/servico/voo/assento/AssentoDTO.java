package com.grupo14.companhia_aerea.servico.voo.assento;

import com.grupo14.companhia_aerea.dominio.voo.Assento;

public class AssentoDTO {
    private boolean ocupado;
    private int codigoDoAssento;

    public AssentoDTO(){}

    public AssentoDTO(boolean ocupado, int codigoDoAssento) {
        this.ocupado = ocupado;
        this.codigoDoAssento = codigoDoAssento;
    }

    public void mapearParaDTO(Assento assento) {
        setCodigoDoAssento(assento.getCodigoDoAssento());
        setOcupado(assento.isOcupado());
    }

    public Assento mapearParaAssento() {
        Assento assento = new Assento();
        assento.setCodigoDoAssento(getCodigoDoAssento());
        assento.setOcupado(isOcupado());
        return assento;
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

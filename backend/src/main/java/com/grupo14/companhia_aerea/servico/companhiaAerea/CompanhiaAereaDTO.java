package com.grupo14.companhia_aerea.servico.companhiaAerea;

import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;

public class CompanhiaAereaDTO {
    private String nome;
    private String codigoICAO;
    private String pais;

    public CompanhiaAereaDTO() {}

    public void mapearParaDTO(CompanhiaAerea companhiaAerea) {
        setNome(companhiaAerea.getNome());
        setCodigoICAO(companhiaAerea.getCodigoICAO());
        setPais(companhiaAerea.getPais());
    }

    public CompanhiaAerea mapearParaCompanhia() {
        CompanhiaAerea companhia = new CompanhiaAerea();
        companhia.setNome(getNome());
        companhia.setCodigoICAO(getCodigoICAO());
        companhia.setPais(getPais());
        return companhia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoICAO() {
        return codigoICAO;
    }

    public void setCodigoICAO(String codigoICAO) {
        this.codigoICAO = codigoICAO;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

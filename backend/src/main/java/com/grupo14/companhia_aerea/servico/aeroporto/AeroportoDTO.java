package com.grupo14.companhia_aerea.servico.aeroporto;

import com.grupo14.companhia_aerea.dominio.Aeroporto;

public class AeroportoDTO {
    private String nome;
    private String cidade;
    private String pais;
    private String codigoIATA;

    public AeroportoDTO(){}

    public void mapearParaDTO(Aeroporto aeroporto) {
        setNome(aeroporto.getNome());
        setCidade(aeroporto.getCidade());
        setPais(aeroporto.getPais());
        setCodigoIATA(aeroporto.getCodigoIATA());
    }

    public Aeroporto mapearParaAeroporto() {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setNome(getNome());
        aeroporto.setCidade(getCidade());
        aeroporto.setPais(getPais());
        aeroporto.setCodigoIATA(getCodigoIATA());
        return aeroporto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }
}

package com.grupo14.companhia_aerea.servico.voo;

import com.grupo14.companhia_aerea.servico.voo.assento.AssentoDTO;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoDTO;
import com.grupo14.companhia_aerea.servico.companhiaAerea.CompanhiaAereaDTO;

import java.util.Date;
import java.util.List;

public class VooDTO {
    private List<AssentoDTO> assentosDTO;
    private AeroportoDTO origemDTO;
    private AeroportoDTO destinoDTO;
    private Date dataDeIda;
    private double valorPorAdulto;
    private double valorPorCrianca;
    private int numeroDeAdultos;
    private int numeroDeCriancas;
    private double precoTotal;
    private CompanhiaAereaDTO companhiaAereaDTO;

    public VooDTO() {}

    public List<AssentoDTO> getAssentosDTO() {
        return assentosDTO;
    }

    public void setAssentosDTO(List<AssentoDTO> assentosDTO) {
        this.assentosDTO = assentosDTO;
    }

    public AeroportoDTO getOrigemDTO() {
        return origemDTO;
    }

    public void setOrigemDTO(AeroportoDTO origemDTO) {
        this.origemDTO = origemDTO;
    }

    public AeroportoDTO getDestinoDTO() {
        return destinoDTO;
    }

    public void setDestinoDTO(AeroportoDTO destinoDTO) {
        this.destinoDTO = destinoDTO;
    }

    public Date getDataDeIda() {
        return dataDeIda;
    }

    public void setDataDeIda(Date dataDeIda) {
        this.dataDeIda = dataDeIda;
    }

    public double getValorPorAdulto() {
        return valorPorAdulto;
    }

    public void setValorPorAdulto(double valorPorAdulto) {
        this.valorPorAdulto = valorPorAdulto;
    }

    public double getValorPorCrianca() {
        return valorPorCrianca;
    }

    public void setValorPorCrianca(double valorPorCrianca) {
        this.valorPorCrianca = valorPorCrianca;
    }

    public int getNumeroDeAdultos() {
        return numeroDeAdultos;
    }

    public void setNumeroDeAdultos(int numeroDeAdultos) {
        this.numeroDeAdultos = numeroDeAdultos;
    }

    public int getNumeroDeCriancas() {
        return numeroDeCriancas;
    }

    public void setNumeroDeCriancas(int numeroDeCriancas) {
        this.numeroDeCriancas = numeroDeCriancas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public CompanhiaAereaDTO getCompanhiaAereaDTO() {
        return companhiaAereaDTO;
    }

    public void setCompanhiaAereaDTO(CompanhiaAereaDTO companhiaAereaDTO) {
        this.companhiaAereaDTO = companhiaAereaDTO;
    }
}

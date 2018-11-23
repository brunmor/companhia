package com.grupo14.companhia_aerea.aplicacao;

import com.grupo14.companhia_aerea.dominio.Comprador;

import java.util.Date;

public class CompradorDTO {
    private String nome;
    private String cpf;
    private String email;
    private Date dataDeNascimento;
    private String telefone;
    private String endereco;

    public CompradorDTO(){}

    public void mapearParaDTO(Comprador comprador) {
        setNome(comprador.getNome());
        setCpf(comprador.getCpf());
        setEmail(comprador.getEmail());
        setDataDeNascimento(comprador.getDataDeNascimento());
        setTelefone(comprador.getTelefone());
        setEndereco(comprador.getEndereco());
    }

    public Comprador mapearParaComprador() {
        Comprador comprador = new Comprador();
        comprador.setNome(getNome());
        comprador.setCpf(getCpf());
        comprador.setEmail(getEmail());
        comprador.setDataDeNascimento(getDataDeNascimento());
        comprador.setTelefone(getTelefone());
        comprador.setEndereco(getEndereco());
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

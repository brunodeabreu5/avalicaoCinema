package com.example.casadooleo.aplicacao;

import com.example.casadooleo.aplicacao.Veiculos;

public class Cliente {

    String nomeCliente;
    String endereco;
    String email;
    String telefone;
    Veiculos veiculo;



    public Cliente (String nomeCliente, String endereco, String email, String telefone, Veiculos veiculo) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public Cliente(){};

    public String getNomeCliente () {
        return nomeCliente;
    }

    public void setNomeCliente (String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public Veiculos getVeiculo () {
        return veiculo;
    }

    public void setVeiculo (Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString () {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculos='"+ veiculo + '\''+
                '}';
    }
}

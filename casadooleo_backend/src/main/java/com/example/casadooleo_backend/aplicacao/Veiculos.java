package com.example.casadooleo.aplicacao;

public class Veiculos {

    private int idVeiculo;
    private String marca;
    private String modelo;
    private String placaDoVeiculo;
    private int ano;

    public Veiculos (int idVeiculo, String marca, String modelo, String placaDoVeiculo, int ano) {
        this.idVeiculo = idVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.placaDoVeiculo = placaDoVeiculo;
        this.ano = ano;
    }

    public Veiculos () {

    }

    public int getIdVeiculo () {
        return idVeiculo;
    }

    public void setIdVeiculo (int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getModelo () {
        return modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaDoVeiculo () {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo (String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public int getAno () {
        return ano;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    @Override
    public String toString () {
        return "Veiculos{" +
                "idVeiculo=" + idVeiculo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placaDoVeiculo='" + placaDoVeiculo + '\'' +
                ", ano=" + ano +
                '}';
    }
}


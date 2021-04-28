package com.example.avaliacaoCinema.model;

public class Cinema {

    private int idCinema;
    private String nomeDoCinema;
    private String endereco;
    private String telefone;
    private Filme filme;

    public Cinema (){}

    public Cinema (int idCinema, String nomeDoCinema, String endereco, String telefone, Filme filme) {
        this.idCinema = idCinema;
        this.nomeDoCinema = nomeDoCinema;
        this.endereco = endereco;
        this.telefone = telefone;
        this.filme = filme;
    }

    public int getIdCinema () {
        return idCinema;
    }

    public void setIdCinema (int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNomeDoCinema () {
        return nomeDoCinema;
    }

    public void setNomeDoCinema (String nomeDoCinema) {
        this.nomeDoCinema = nomeDoCinema;
    }

    public String getEndereco () {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public Filme getFilme () {
        return filme;
    }

    public void setFilme (Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString () {
        return "Cinemas{" +
                "idCinema=" + idCinema +
                ", nomeDoCinema='" + nomeDoCinema + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", filme='" + filme + '\'' +
                '}';
    }
}

package com.example.avaliacaoCinema.model;

public class CategoriaDeFilme {

    private int idCategoria;
    private String generos;

    public CategoriaDeFilme () {
    }

    public CategoriaDeFilme (int idCategoria, String generos) {
        this.idCategoria = idCategoria;
        this.generos = generos;
    }

    public int getIdCategoria () {
        return idCategoria;
    }

    public void setIdCategoria (int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getGeneros () {
        return generos;
    }

    public void setGeneros (String generos) {
        this.generos = generos;
    }

    @Override
    public String toString () {
        return "CategoriaDeFilmes{" +
                "idCategoria=" + idCategoria +
                ", generos='" + generos + '\'' +
                '}';
    }
}

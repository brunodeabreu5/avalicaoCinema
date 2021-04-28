package com.example.avaliacaoCinema.model;

public class Filme {

    private int idFilme;
    private String nome;
    private int ano;
    private double duracao;
    private String descricao;

    public Filme (){}

    public Filme (int idFilme, String nome, int ano, double duracao, String descricao) {
        this.idFilme = idFilme;
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public int getIdFilme () {
        return idFilme;
    }

    public void setIdFilme (int idFilme) {
        this.idFilme = idFilme;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getAno () {
        return ano;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public double getDuracao () {
        return duracao;
    }

    public void setDuracao (double duracao) {
        this.duracao = duracao;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString () {
        return "Filmes{" +
                "idFilme=" + idFilme +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", duracao=" + duracao +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

package com.example.avaliacaoCinema.model;

public class Sessoes {

    private String data;
    private String hora;
    private int sala;
    private int tempoDeDuracao;
    private String idioma;

    public Sessoes () {
    }

    public Sessoes (String data, String hora, int sala, int tempoDeDuracao, String idioma) {
        this.data = data;
        this.hora = hora;
        this.sala = sala;
        this.tempoDeDuracao = tempoDeDuracao;
        this.idioma = idioma;
    }

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public String getHora () {
        return hora;
    }

    public void setHora (String hora) {
        this.hora = hora;
    }

    public int getSala () {
        return sala;
    }

    public void setSala (int sala) {
        this.sala = sala;
    }

    public int getTempoDeDuracao () {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao (int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public String getIdioma () {
        return idioma;
    }

    public void setIdioma (String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString () {
        return "Sessoes{" +
                "data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", sala=" + sala +
                ", tempoDeDuracao=" + tempoDeDuracao +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}

package com.example.avaliacaoCinema.dao;

import com.example.avaliacaoCinema.connection.ConnectionFactory;
import com.example.avaliacaoCinema.model.Sessoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SessoesDao {

    Connection connection;

    public SessoesDao () {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criaTabelaSessoesDao () {
        String sql = "CREATE TABLE IF NOT EXISTS sessoes (" +
                "idSessao INT PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                "dia int NOT NULL," +
                "hora int NOT NULL," +
                "sala int ," +
                "duracao int," +
                "idioma varchar(10),";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela Criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Sessoes> listaDeSessoes () {
        String sql = "SELECT * FROM sessoes";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            List<Sessoes> sessoes = new ArrayList<>();

            ResultSet resultSet = st.executeQuery();

            Sessoes sessao;
            while (resultSet.next()) {
                sessao = new Sessoes();
                sessao.setData(resultSet.getString("idSessoes"));
                sessao.setHora(resultSet.getString("hora"));
                sessao.setSala(resultSet.getInt("sala"));
                sessao.setTempoDeDuracao(resultSet.getInt("tempoDeDuracao"));
                sessao.setIdioma(resultSet.getString("idioma"));

                sessoes.add(sessao);
            }
            return sessoes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Sessoes consultaSessoesId (int id) {
        String sql = "SELECT * FROM filme WHERE idSessoes =?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Sessoes sessoes = new Sessoes();

            while (rs.next()) {
                sessoes.setData(rs.getString("idSessoes"));
                sessoes.setHora(rs.getString("hora"));
                sessoes.setSala(rs.getInt("sala"));
                sessoes.setTempoDeDuracao(rs.getInt("tempoDeDuracao"));
                sessoes.setIdioma(rs.getString("idioma"));
            }
            return sessoes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

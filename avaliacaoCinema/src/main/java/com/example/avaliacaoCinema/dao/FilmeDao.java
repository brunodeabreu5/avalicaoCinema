package com.example.avaliacaoCinema.dao;

import com.example.avaliacaoCinema.connection.ConnectionFactory;
import com.example.avaliacaoCinema.model.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {

    Connection connection;

    public FilmeDao () {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criaTabelaFilme () {
        String sql = "CREATE TABLE IF NOT EXISTS filme (" +
                "idFilme INT PRIMARY KEY AUTO_INCREMENT," +
                "nomeDoFilme VARCHAR(30) NOT NULL," +
                "ano int," +
                "duracao float," +
                "descricao VARCHAR(50),";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela Criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Filme> listaFilme () {
        String sql = "SELECT * FROM cliente";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            List<Filme> filmeList = new ArrayList<>();

            ResultSet resultSet = st.executeQuery();

            Filme filme;
            while (resultSet.next()) {
                filme = new Filme();
                filme.setIdFilme(resultSet.getInt("idFilme"));
                filme.setNome(resultSet.getString("nome"));
                filme.setAno(resultSet.getInt("ano"));
                filme.setDuracao(resultSet.getInt("duracao"));
                filme.setDescricao(resultSet.getString("descricao"));

                filmeList.add(filme);
            }
            return filmeList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Filme consultaFilmePorId (int id) {
        String sql = "SELECT * FROM filme WHERE idFilme =?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Filme filmes = new Filme();

            while (rs.next()) {
                filmes.setIdFilme(rs.getInt("idFilme"));
                filmes.setNome(rs.getString("nome"));
                filmes.setAno(rs.getInt("ano"));
                filmes.setDuracao(rs.getInt("duracao"));
                filmes.setDescricao(rs.getString("descricao"));
            }
            return filmes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

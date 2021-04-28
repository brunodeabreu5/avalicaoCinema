package com.example.avaliacaoCinema.dao;

import com.example.avaliacaoCinema.connection.ConnectionFactory;
import com.example.avaliacaoCinema.model.Cinema;
import com.example.avaliacaoCinema.model.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaDao {

    Connection connection;

    public CinemaDao () {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criaTabelaCinema () {
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "idCinema INT PRIMARY KEY AUTO_INCREMENT," +
                "nomeDoCinema VARCHAR(40) NOT NULL," +
                "endereco VACHAR(50)," +
                "telefone VARCHAR(15),"+
                "CONSTRAINT fk_idFilme FOREIGN KEY (idFilme)" +
                "REFERENCES filme(idFilme)" +
                ");";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela Criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Cinema> listaCinema () {
        String sql = "SELECT * FROM cinema";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            List<Cinema> cinemas = new ArrayList<>();
            Cinema cinema;

            while (resultSet.next()) {
                cinema = new Cinema();
                cinema.setIdCinema(resultSet.getInt("idCinema"));
                cinema.setNomeDoCinema(resultSet.getString("nomeDoCinema"));
                cinema.setEndereco(resultSet.getString("endereco"));
                cinema.setTelefone(resultSet.getString("telefone"));

                FilmeDao filmeDao = new FilmeDao();
                Filme filme = filmeDao.consultaFilmePorId(resultSet.getInt("idFilme"));
                cinema.setFilme(filme);

                cinemas.add(cinema);
            }

            return cinemas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cinema consultaCinemaPorId (int id) {
        String sql = "SELECT * FROM filme WHERE idCinema =?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Cinema cinemas = new Cinema();

            while (rs.next()) {
                cinemas.setIdCinema(rs.getInt("idCinema"));
                cinemas.setNomeDoCinema(rs.getString("nome"));
                cinemas.setEndereco(rs.getString("endereco"));
                cinemas.setTelefone(rs.getString("telefone"));
            }
            return cinemas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
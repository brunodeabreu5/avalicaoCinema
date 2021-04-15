package com.example.casadooleo.dao;

import com.example.casadooleo.factory.ConnectionFactory;
import com.example.casadooleo.aplicacao.Veiculos;
import com.example.casadooleo.dao.criarTabela.Tabelas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VeiculoDAO {

    private Connection connection;

    public VeiculoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }


    public void cadastraVeiculos (Veiculos v) {
        String sql = "INSERT INTO veiculos" +
                "(marca,modelo,placaDoVeiculo,ano) " +
                "VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            //stmt.setInt(1, v.getIdVeiculo());
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getModelo());
            stmt.setString(3, v.getPlacaDoVeiculo());
            stmt.setInt(4, v.getAno());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void listaDeVeiculos () {
        String sql = "SELECT * FROM veiculos";

        try {
            PreparedStatement smt = connection.prepareStatement(sql);

            ResultSet veiculos = smt.executeQuery();

            while (veiculos.next()) {
                System.out.println(veiculos.getString("marca"));
                System.out.println(veiculos.getString("modelo"));
                System.out.println(veiculos.getString("placaDoVeiculo"));
                System.out.println(veiculos.getString("ano"));
                System.out.println("---------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}



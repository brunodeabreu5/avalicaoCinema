package com.example.casadooleo.dao.criarTabela;

import com.example.casadooleo.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tabelas {

    private Connection connection;

    public Tabelas () {
        this.connection = new ConnectionFactory().getConnection();
        this.criaTabelaUsuario();
        this.criaTabelaCliente();
        //this.criaTabelaVeiculos();
        //this.criaTabelaOrdemDeServico();
    }

    public void criaTabelaUsuario () {
        String sql = "create table usuario (\n" +
                "idUsuario int PRIMARY KEY AUTO_INCREMENT, \n" +
                "login varchar(30)  NOT NULL UNIQUE,\n" +
                "senha varchar(30) NOT NULL\n" +
                ");";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela usuario criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void criaTabelaCliente () {
        String sql = "create table cliente (\n" +
                "idCliente int PRIMARY KEY AUTO_INCREMENT,\n" +
                "nome varchar(30) NOT NULL,\n" +
                "endereco varchar(40),\n" +
                "email varchar(40) UNIQUE,\n" +
                "telefone int\n" +
                ");";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela cliente criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void criaTabelaVeiculos () {
        String sql = "create table veiculos (\n" +
                "idVeiculos int PRIMARY KEY UNIQUE AUTO_INCREMENT,\n" +
                "marca varchar(20),\n" +
                "modelo varchar(20),\n" +
                "placaDoVeiculo varchar(10) NOT NULL,\n" +
                "ano year\n" +
                ");";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela veiculos criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void criaTabelaOrdemDeServico () {
        String sql = "create table ordemDeServico(\n" +
                "idOrdemDeServico int primary key auto_increment,\n" +
                "tipoDeServico varchar(50),\n" +
                "valor decimal(10,2),\n" +
                "dia date,\n" +
                "descricao varchar(100),\n" +
                "idVeiculo int\n" +
                ");";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            System.out.println("Tabela Ordem De Servico criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

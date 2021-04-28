package com.example.avaliacaoCinema.controller;

import com.example.avaliacaoCinema.dao.FilmeDao;
import com.example.avaliacaoCinema.model.Filme;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("filmes")
public class FilmeControlle {


    @GET
    @Path("criatabela")
    @Produces("application/json")
    public Response criaTabelaFilme () {
        FilmeDao filmeDao = new FilmeDao();
        filmeDao.criaTabelaFilme();
        return Response.ok(new Gson().toJson("Tabela criada com sucesso!")).build();
    }


    @GET
    @Produces("aplication/json")
    public Response listaCinema () {
        FilmeDao filmeDao = new FilmeDao();
        List<Filme> filmes = filmeDao.listaFilme();
        return Response.ok(new Gson().toJson(filmes)).build();
    }

    @GET
    @Path("{idFilmes}")
    @Produces("application/json")
    public Response getIdCinema (@PathParam("idFilmes") int id) {
        FilmeDao filmeDao = new FilmeDao();
        Filme filme = filmeDao.consultaFilmePorId(id);
        return Response.ok(new Gson().toJson(filme)).build();
    }
}

package com.example.avaliacaoCinema.controller;

import com.example.avaliacaoCinema.dao.CinemaDao;
import com.example.avaliacaoCinema.dao.FilmeDao;
import com.example.avaliacaoCinema.model.Cinema;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("Cinema")
public class CinemaControlle {

    @GET
    @Path("criatabela")
    @Produces("application/json")
    public Response criaTabelaCinema () {
        CinemaDao cinemaDao = new CinemaDao();
        cinemaDao.criaTabelaCinema();
        return Response.ok(new Gson().toJson("Tabela criada com sucesso!")).build();
    }


    @GET
    @Produces("aplication/json")
    public Response listaCinema () {
        CinemaDao cinemaDao = new CinemaDao();
        List<Cinema> cinemas = cinemaDao.listaCinema();
        return Response.ok(new Gson().toJson(cinemas)).build();
    }

    @GET
    @Path("{idCinema}")
    @Produces("application/json")
    public Response getIdCinema (@PathParam("idCinema") int id) {
        CinemaDao cinemaDao = new CinemaDao();
        Cinema cinema = cinemaDao.consultaCinemaPorId(id);
        return Response.ok(new Gson().toJson(cinema)).build();
    }

}

package com.mx.SistemaPeliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.SistemaPeliculas.model.Peliculas;

public interface PeliculasDao extends JpaRepository<Peliculas, Integer> {

}

package com.mx.SistemaPeliculas.service;

import java.util.List;

import com.mx.SistemaPeliculas.model.Peliculas;

public interface PeliculasServ {
	
	public List<Peliculas> listar();
	
	public void guardar(Peliculas peliculas);
	
	public Peliculas buscar(int idPeliculas);
	
	public void editar(Peliculas peliculas);
	
	public void eliminar(int idPeliculas);

}

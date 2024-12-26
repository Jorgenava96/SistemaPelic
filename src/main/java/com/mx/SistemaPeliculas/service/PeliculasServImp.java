package com.mx.SistemaPeliculas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SistemaPeliculas.dao.PeliculasDao;
import com.mx.SistemaPeliculas.model.Peliculas;

@Service
public class PeliculasServImp implements PeliculasServ{
	
	@Autowired
	PeliculasDao dao;

	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void guardar(Peliculas peliculas) {
		dao.save(peliculas);
		
	}

	@Override
	public Peliculas buscar(int idPeliculas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Peliculas peliculas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idPeliculas) {
		// TODO Auto-generated method stub
		
	}

}

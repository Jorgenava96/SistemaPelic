package com.mx.SistemaPeliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SistemaPeliculas.model.Peliculas;
import com.mx.SistemaPeliculas.service.PeliculasServImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "PeliculasWebService")
@CrossOrigin
public class PeliculasWebService {
	
	@Autowired
	PeliculasServImp imp;
	
	@GetMapping("listar")
	public List<Peliculas> listar(){
		return imp.listar();
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Peliculas peliculas) {
		imp.guardar(peliculas);
	}
	
}

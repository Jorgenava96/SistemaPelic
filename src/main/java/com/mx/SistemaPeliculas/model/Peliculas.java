package com.mx.SistemaPeliculas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PELICULAS2")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Peliculas {
	
	@Id
	@Column(name="ID_PELICULAS", columnDefinition = "NUMBER",nullable = false )
	private Integer idPeliculas;
	
	@Column(name="NOMBRE", columnDefinition = "VARCHAR2(90)",nullable = false )
	private String nombre;
	
	@Column(name="GENERO", columnDefinition = "VARCHAR2(80)",nullable = false )
	private String genero;
	
	@Column(name="PRECIO", columnDefinition = "NUMBER",nullable = false )
	private long precio;
	
	

}

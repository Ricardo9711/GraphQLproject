package com.richi.graphqlproject.models.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richi.graphqlproject.models.dao.AlmacenRepository;
import com.richi.graphqlproject.models.entity.Almacen;

@Service
public class AlmacenService {

@Autowired
private AlmacenRepository repo;


/*public AlmacenService(AlmacenRepository repo) {
	this.repo = repo;
}*/
	
	public Almacen registrarAlmacen(final String nombre,final String pais,final String departamento,final String ciudad,final String direccion,final String estado,final Integer indTienda)
	{
		return repo.save(Almacen.builder()
				.nombre(nombre)
				.pais(pais)
				.departamento(departamento)
				.ciudad(ciudad)
				.direccion(direccion)
				.estado(estado)
				.indTienda(indTienda)
				.usuarioCrea("Richi")
				.build());
	}
	
	public Optional<Almacen> almacen(final Long id) {
		return repo.findById(id);
	}
	
	public List<Almacen> almacenes(final int cantidad) {
		return repo.findAll().parallelStream().limit(cantidad).collect(Collectors.toList());
	}

}

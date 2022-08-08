package com.richi.graphqlproject.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.richi.graphqlproject.models.entity.Almacen;
import com.richi.graphqlproject.models.service.AlmacenService;

@Component
public class AlmacenMutationResolver implements GraphQLMutationResolver{

	@Autowired
	private AlmacenService almacenSvc;
	
	public Almacen registrarAlmacen(
			final String nombre,
		    final String pais,
		    final String departamento,
		    final String ciudad,
		    final String direccion,
		    final String estado,
		    final Integer indTienda) {
		
		return almacenSvc.registrarAlmacen(
				nombre,
				pais,
				departamento,
				ciudad,
				direccion,
				estado,
				indTienda);
	}
}

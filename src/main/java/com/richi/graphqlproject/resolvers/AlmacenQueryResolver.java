package com.richi.graphqlproject.resolvers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.richi.graphqlproject.models.entity.Almacen;
import com.richi.graphqlproject.models.service.AlmacenService;

@Component
public class AlmacenQueryResolver implements GraphQLQueryResolver{

	@Autowired
	private AlmacenService almacenSvc;
	
	public List<Almacen> almacenes(final int cantidad) {
		return almacenSvc.almacenes(cantidad);
	}
	
	public Optional<Almacen> almacen(final Long id) {
		return almacenSvc.almacen(id);
	}
}

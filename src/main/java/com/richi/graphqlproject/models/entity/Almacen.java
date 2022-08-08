package com.richi.graphqlproject.models.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder /*anotación de graphql*/
public class Almacen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String nombre;
	private String pais;
	private String departamento; //estado, prefectura
	private String ciudad; // distrito, cacerio, 
	private String direccion;
	private String estado;
	private Integer indTienda;
	private String usuarioCrea;

}

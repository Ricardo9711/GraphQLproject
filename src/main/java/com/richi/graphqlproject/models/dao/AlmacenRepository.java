package com.richi.graphqlproject.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richi.graphqlproject.models.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long>{

}

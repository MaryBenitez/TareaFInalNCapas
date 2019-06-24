package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

	
}

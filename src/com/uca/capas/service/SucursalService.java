package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.uca.capas.domain.Sucursal;

public interface SucursalService {
	
	public List<Sucursal> findAll();
	public Sucursal guardar(Sucursal sucursal);
	public Sucursal findOne(Integer id);
	public void borrar(Integer id);
	

}

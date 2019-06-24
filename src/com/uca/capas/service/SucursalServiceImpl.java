package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.repositories.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService{

	@Autowired
	SucursalRepository SucursalR;
	
	@Override
	public List<Sucursal> findAll(){
		// TODO Auto-generated method stub
		return SucursalR.findAll();
	}

	@Override
	public Sucursal guardar(Sucursal sucursal) {
		// TODO Auto-generated method stub
		return SucursalR.save(sucursal);
	}

	@Override
	public Sucursal findOne(Integer id) {
		// TODO Auto-generated method stub
		return SucursalR.findById(id).get();
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		SucursalR.deleteById(id);;
	}

	
}

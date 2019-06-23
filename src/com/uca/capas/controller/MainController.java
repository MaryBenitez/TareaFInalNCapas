package com.uca.capas.controller;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.SucursalService;

@Controller
public class MainController {
	
	//Objeto Logger
	static Logger log = Logger.getLogger(MainController.class.getName());

	@Autowired
	SucursalService SucursalR;
	
	@RequestMapping("")
	public ModelAndView initMain() {
		
		ModelAndView mav = new ModelAndView();
		Usuario usuario = new Usuario();
		mav.addObject("usuario",usuario);
		mav.setViewName("login");
		
		return mav;
	}
	
	/*@RequestMapping("/ListaSucursales")
	public ModelAndView ListaSucursales() {
		ModelAndView mav = new ModelAndView();		
		mav.addObject("sucursal",SucursalR.findAll());
		mav.setViewName("sucursales");
		
		return mav;
	}*/
	
	@RequestMapping(value="/ListaSucursales")
	public ModelAndView ListaSucursales(){
		log.info("Entrando a funcion init-main " + log.getName());
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
		//Selecciono todos los elementos de la tabla sucursal
			log.info("Termino de buscar en la base de datos");
		}
		catch(Exception e){
			log.log(Level.SEVERE,"Exception Occur",e);
		}
		mav.addObject("sucursal",SucursalR.findAll());
		mav.setViewName("sucursales");
		return mav;
	}
	
	
}

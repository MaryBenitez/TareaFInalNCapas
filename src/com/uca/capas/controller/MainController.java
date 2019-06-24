package com.uca.capas.controller;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.SucursalService;

@Controller
public class MainController {
	
	@Autowired
	SucursalService SucursalS;
	
	@RequestMapping("")
	public ModelAndView initMain() {
		
		ModelAndView mav = new ModelAndView();
		Usuario usuario = new Usuario();
		mav.addObject("usuario",usuario);
		mav.setViewName("login");
		
		return mav;
	}
	
	@RequestMapping(value = "/ListaSucursales", method = RequestMethod.POST)
	public ModelAndView ListaSucursales(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", SucursalS.findAll());
		mav.setViewName("sucursales");
		return mav;
	}
	
	@RequestMapping(value="/Registro", method = RequestMethod.POST)
	public ModelAndView Registro(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal());
		mav.setViewName("registro");
		return mav;
	}
	
	@RequestMapping(value="/Guardar", method = RequestMethod.POST)
	public ModelAndView Guardar(@ModelAttribute("sucursal")Sucursal s, BindingResult r){
		ModelAndView mav = new ModelAndView();
		if(r.hasErrors()) {
			r.getAllErrors().forEach((element)->{
				System.out.println(element.getDefaultMessage());
			});
			mav.setViewName("registro");
		}
		else {
		
		SucursalS.guardar(s);
		mav.setViewName("registro");
		
		}
		return mav;
	}
	
}

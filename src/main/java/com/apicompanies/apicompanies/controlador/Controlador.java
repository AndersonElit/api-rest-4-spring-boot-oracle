package com.apicompanies.apicompanies.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.servicio.Servicio;

@RestController
public class Controlador implements ControladorInt {
	
	@Autowired
	private Servicio serv;

	@Override
	@RequestMapping(value="/insertarEmp", method = RequestMethod.POST)
	public void insertarEmp(Modelo mod) {
		serv.insertarEmpresa(mod);
	}

}

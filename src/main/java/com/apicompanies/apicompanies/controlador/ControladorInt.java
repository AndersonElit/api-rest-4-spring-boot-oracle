package com.apicompanies.apicompanies.controlador;

import org.springframework.web.bind.annotation.RequestBody;

import com.apicompanies.apicompanies.modelo.Modelo;

public interface ControladorInt {
	
	public void insertarEmp(@RequestBody Modelo mod);

}

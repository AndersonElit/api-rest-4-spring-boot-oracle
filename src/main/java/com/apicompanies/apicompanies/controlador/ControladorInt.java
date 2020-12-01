package com.apicompanies.apicompanies.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.apicompanies.apicompanies.modelo.Modelo;

public interface ControladorInt {
	
	public List<Modelo> insertarEmpresa(@RequestBody Modelo mod);

}

package com.apicompanies.apicompanies.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.repositorio.Repositorio;

@Service
public class Servicio implements ServicioInt {
	
	@Autowired
	private Repositorio repo;

	@Override
	public List<Modelo> insertarEmpresa(Modelo mod) {
		return repo.insertarEmpresa(mod);
	}
	
	/*
	@Override
	public void insertarEmpresa(Modelo mod) {
		repo.insertarEmpresa(mod);
	}
	*/

}

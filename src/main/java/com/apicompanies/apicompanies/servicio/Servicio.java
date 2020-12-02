package com.apicompanies.apicompanies.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modelocli.ModeloCli;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;
import com.apicompanies.apicompanies.repositorio.Repositorio;

@Service
public class Servicio implements ServicioInt {
	
	@Autowired
	private Repositorio repo;
	
	@Override
	public List<Modelo> insertarEmpresa(Modelo mod) {
		return repo.insertarEmpresa(mod);
	}

	@Override
	public Modelo buscarEmpresa(int id) {
		return repo.buscarEmpresa(id);
	}
	
	@Override
	public ModeloCli buscarCliente(int id) {
		return repo.buscarCliente(id);
	}

	@Override
	public Modelo eliminarEmpresa(int id) {
		return repo.eliminarEmpresa(id);
	}

	@Override
	public Modelo editarEmpresa(int id, String nombre) {
		return repo.editarEmpresa(id, nombre);
	}
	
	@Override
	public List<ModeloCli> clientesEmpresa(String empresa) {
		return repo.clientesEmpresa(empresa);
	}

	@Override
	public ModeloR reporteEmpresa(String empresa) {
		return repo.reporteEmpresa(empresa);
	}
	
	@Override
	public List<ModeloR> reporteEmpresas() {
		return repo.reporteEmpresas();
	}

}

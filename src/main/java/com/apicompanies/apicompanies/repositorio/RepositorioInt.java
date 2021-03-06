package com.apicompanies.apicompanies.repositorio;

import java.util.List;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modelocli.ModeloCli;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;

public interface RepositorioInt {
	
	public List<Modelo> insertarEmpresa(Modelo mod);
	
	public Modelo buscarEmpresa(int id);
	
	public ModeloCli buscarCliente(int id);
	
	public Modelo eliminarEmpresa(int id);
	
	public Modelo editarEmpresa(int id, String nombre);
	
	public List<ModeloCli> clientesEmpresa(String empresa);
	
	public ModeloR reporteEmpresa(String empresa);
	
	public List<ModeloR> reporteEmpresas();

}

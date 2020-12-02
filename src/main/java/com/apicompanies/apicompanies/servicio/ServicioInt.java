package com.apicompanies.apicompanies.servicio;

import java.util.List;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modelocli.ModeloCli;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;

public interface ServicioInt {
	
	public List<Modelo> insertarEmpresa(Modelo mod);
	
	public Modelo buscarEmpresa(int id);
	
	public ModeloCli buscarCliente(int id);
	
	public Modelo eliminarEmpresa(int id);
	
	public Modelo editarEmpresa(int id, String nombre);
	
	public ModeloR reporteEmpresa(String empresa);
	
	public List<ModeloR> reporteEmpresas();

}

package com.apicompanies.apicompanies.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modelocli.ModeloCli;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;

public interface ControladorInt {
	
	public List<Modelo> insertarEmpresa(@RequestBody Modelo mod);
	
	public Modelo buscarEmpresa(@PathVariable int id);
	
	public ModeloCli buscarCliente(@PathVariable int id);
	
	public Modelo eliminarEmpresa(@PathVariable int id);
	
	public Modelo editarEmpresa(@PathVariable int id, @PathVariable String nombre);
	
	public List<ModeloCli> clientesEmpresa(@PathVariable String empresa);
	
	public ModeloR reporteEmpresa(@PathVariable String empresa);
	
	public List<ModeloR> reporteEmpresas();

}

package com.apicompanies.apicompanies.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modelocli.ModeloCli;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;
import com.apicompanies.apicompanies.servicio.Servicio;

@RestController
public class Controlador implements ControladorInt {
	
	@Autowired
	private Servicio serv;
	
	@Override
	@RequestMapping(value="/insertarEmp", method = RequestMethod.POST)
	public List<Modelo> insertarEmpresa(@RequestBody Modelo mod) {
		return serv.insertarEmpresa(mod);
	}

	@Override
	@RequestMapping(value="/buscarEmp/{id}", method = RequestMethod.POST)
	public Modelo buscarEmpresa(@PathVariable int id) {
		return serv.buscarEmpresa(id);
	}
	
	@Override
	@RequestMapping(value="/buscarCli/{id}", method = RequestMethod.POST)
	public ModeloCli buscarCliente(@PathVariable int id) {
		return serv.buscarCliente(id);
	}

	@Override
	@RequestMapping(value="/eliminarEmp/{id}", method = RequestMethod.DELETE)
	public Modelo eliminarEmpresa(@PathVariable int id) {
		return serv.eliminarEmpresa(id);
	}

	@Override
	@RequestMapping(value="/editarEmp/{id}/{nombre}", method = RequestMethod.PUT)
	public Modelo editarEmpresa(@PathVariable int id, @PathVariable String nombre) {
		return serv.editarEmpresa(id, nombre);
	}

	@Override
	@RequestMapping(value="/reporteEmp/{empresa}", method = RequestMethod.POST)
	public ModeloR reporteEmpresa(@PathVariable String empresa) {
		return serv.reporteEmpresa(empresa);
	}
	
	
	@Override
	@RequestMapping(value="/reporteTotal", method = RequestMethod.GET)
	public List<ModeloR> reporteEmpresas() {
		return serv.reporteEmpresas();
	}

}

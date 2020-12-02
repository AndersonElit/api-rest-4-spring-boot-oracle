package com.apicompanies.apicompanies.modeloreporte;

public class ModeloR implements ModeloRInt {
	
	private String nombre;
	private Number numero_cli;

	@Override
	public void ModelR() {
		
	}

	@Override
	public void ModelR(String nombre, Number numero_cli) {
		this.nombre = nombre;
		this.numero_cli = numero_cli;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Number getNumeroCli() {
		return numero_cli;
	}

	@Override
	public void setNumeroCli(Number numero_cli) {
		this.numero_cli = numero_cli;
	}

}

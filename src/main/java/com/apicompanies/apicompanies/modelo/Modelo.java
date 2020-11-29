package com.apicompanies.apicompanies.modelo;

public class Modelo implements ModeloInt {
	
	private int idEmpresa;
	private String nombre;
	private String res;

	@Override
	public void Model() {
		
	}
	
	@Override
	public void Model(int idEmpresa, String nombre, String res) {
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.res = res;		
	}

	@Override
	public int getId() {
		return idEmpresa;
	}

	@Override
	public void setId(int idEmpresa) {
		this.idEmpresa = idEmpresa;
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
	public String getRes() {
		return res;
	}

	@Override
	public void setRes(String res) {
		this.res = res;
	}

}

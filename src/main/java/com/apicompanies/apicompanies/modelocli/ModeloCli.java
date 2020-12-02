package com.apicompanies.apicompanies.modelocli;

public class ModeloCli implements ModeloCliInt {
	
	private int idPersona;
	private Number cedula;
	private Number telefono;
	private String direccion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String empresa;
	private String estatus;
	private String res;

	@Override
	public void Model() {
		
	}

	@Override
	public void Model(int idPersona, Number cedula, Number telefono, String direccion, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String empresa, String estatus, String res) {
		
		this.idPersona = idPersona;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.empresa = empresa;
		this.estatus = estatus;
		this.res = res;
		
	}

	@Override
	public int getId() {
		return idPersona;
	}

	@Override
	public void setId(int id) {
		this.idPersona = id;
	}

	@Override
	public Number getCedula() {
		return cedula;
	}

	@Override
	public void setCedula(Number cedula) {
		this.cedula = cedula;
	}

	@Override
	public Number getTelefono() {
		return telefono;
	}

	@Override
	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}

	@Override
	public String getDireccion() {
		return direccion;
	}

	@Override
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String getPrimerNombre() {
		return primerNombre;
	}

	@Override
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Override
	public String getSegundoNombre() {
		return segundoNombre;
	}

	@Override
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Override
	public String getPrimerApellido() {
		return primerApellido;
	}

	@Override
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Override
	public String getSegundoApellido() {
		return segundoApellido;
	}

	@Override
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Override
	public String getEmpresa() {
		return empresa;
	}

	@Override
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String getEstatus() {
		return estatus;
	}

	@Override
	public void setEstatus(String estatus) {
		this.estatus = estatus;
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

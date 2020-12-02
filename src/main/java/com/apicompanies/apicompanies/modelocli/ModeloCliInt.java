package com.apicompanies.apicompanies.modelocli;

public interface ModeloCliInt {
	
	public void Model();
	
	public void Model(int id_persona, Number cedula, Number telefono, String direccion, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido, String empresa, String estatus, String res);
	
	public int getId();
	
	public void setId(int id);
	
	public Number getCedula();
	
	public void setCedula(Number cedula);
	
	public Number getTelefono();
	
	public void setTelefono(Number telefono);
	
	public String getDireccion();
	
	public void setDireccion(String direccion);
	
	public String getPrimerNombre();
	
	public void setPrimerNombre(String primerNombre);
	
	public String getSegundoNombre();
	
	public void setSegundoNombre(String segundoNombre);
	
	public String getPrimerApellido();
	
	public void setPrimerApellido(String primerApellido);
	
	public String getSegundoApellido();
	
	public void setSegundoApellido(String segundoApellido);
	
	public String getEmpresa();
	
	public void setEmpresa(String empresa);
	
	public String getEstatus();
	
	public void setEstatus(String estatus);
	
	public String getRes();
	
	public void setRes(String res);

}

package com.apicompanies.apicompanies.repositorio;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.apicompanies.apicompanies.modelo.Modelo;

@Repository
public class Repositorio implements RepositorioInt {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void insertarEmpresa(Modelo mod) {
		
		String name = mod.getNombre();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("insertar_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("empresa", name);
		Map<String, Object> out = jdbcCall.execute(in);
		
		String res = (String) out.get("respuesta");
		System.out.println(res);
		
	}

}

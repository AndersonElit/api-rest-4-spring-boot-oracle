package com.apicompanies.apicompanies.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.apicompanies.apicompanies.modelo.Modelo;
import com.apicompanies.apicompanies.modeloreporte.ModeloR;

@Repository
public class Repositorio implements RepositorioInt {
	
	@Autowired
	private DataSource dataSource;
	//private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Modelo> insertarEmpresa(Modelo mod) {
		
		String name = mod.getNombre();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("insertar_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("EMPRESA", name);
		Map<String, Object> out = jdbcCall.execute(in);
		
		List<Modelo> list = new ArrayList<Modelo>();
		Modelo data = new Modelo();
		data.setNombre(name);
		data.setRes((String) out.get("RESPUESTA"));
		data.setId((Number) out.get("NEW_ID"));
		list.add(data);
		
		return list;
	}
	

	@Override
	public Modelo buscarEmpresa(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("buscar_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_EMP", id);
		Map<String, Object> out = jdbcCall.execute(in);
		
		Modelo data = new Modelo();
		data.setId(id);
		data.setNombre((String) out.get("EMPRESA"));
		String resp = "EMPRESA-ENCONTRADA";
		data.setRes(resp);
		
		return data;
	}


	@Override
	public Modelo eliminarEmpresa(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("eliminar_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_EMP", id);
		Map<String, Object> out = jdbcCall.execute(in);
		
		Modelo data = new Modelo();
		data.setId(id);
		data.setRes((String) out.get("RESPUESTA"));
		return data;
	}


	@Override
	public Modelo editarEmpresa(int id, String nombre) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("editar_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_EMP", id).addValue("NUEVO_NOMBRE", nombre);
		Map<String, Object> out = jdbcCall.execute(in);
		
		Modelo data = new Modelo();
		data.setId(id);
		data.setRes((String) out.get("RESPUESTA"));
		return data;
	}


	@Override
	public ModeloR reporteEmpresa(String empresa) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("reporte_por_empresa").withCatalogName("procedimientos_empresas_out");
		SqlParameterSource in = new MapSqlParameterSource().addValue("NOMBRE_EMP", empresa);
		Map<String, Object> out = jdbcCall.execute(in);
		
		ModeloR data = new ModeloR();
		data.setNombre(empresa);
		data.setNumeroCli((Number) out.get("NUMERO_CLIENTES"));
		return data;
	}

}

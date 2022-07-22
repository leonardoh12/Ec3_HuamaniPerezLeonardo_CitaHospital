package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto;

import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Modelo.Cliente;

public class UsuarioClienteDTORequest {
	
	private String usuario;
	private String contrasenia;
	
	
	
	public UsuarioClienteDTORequest() {
		super();
	}

	public UsuarioClienteDTORequest(String usuario, String contrasenia) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
}
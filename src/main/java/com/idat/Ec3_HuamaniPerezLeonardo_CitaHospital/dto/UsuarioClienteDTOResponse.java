package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto;

import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Modelo.Cliente;

public class UsuarioClienteDTOResponse {
	
	private String token;

	
	
	public UsuarioClienteDTOResponse() {
		super();
	}

	public UsuarioClienteDTOResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}

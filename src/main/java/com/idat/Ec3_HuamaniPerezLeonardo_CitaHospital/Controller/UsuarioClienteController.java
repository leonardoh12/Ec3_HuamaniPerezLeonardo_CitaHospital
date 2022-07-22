package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Security.JwtUtil;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Security.UserDetailService;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.UsuarioClienteDTORequest;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.UsuarioClienteDTOResponse;


@RestController
public class UsuarioClienteController {
	
	@Autowired
	private JwtUtil util;

	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearTokenn(@RequestBody UsuarioClienteDTORequest dto){
		UserDetails details = service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioClienteDTOResponse(util.generateToken(details.getUsername())));
	}
}

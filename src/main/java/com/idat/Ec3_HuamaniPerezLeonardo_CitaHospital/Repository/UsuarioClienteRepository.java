package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Modelo.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {

	UsuarioCliente findByUsuario(String username);

}

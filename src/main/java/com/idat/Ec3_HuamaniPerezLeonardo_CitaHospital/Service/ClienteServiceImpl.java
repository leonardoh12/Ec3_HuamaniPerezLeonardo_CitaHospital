package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.ClienteDTORequest;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.ClienteDTOResponse;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Modelo.Cliente;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Repository.ClienteRepository;



public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		Cliente c= new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setCelular(cliente.getCelularDTO());
		repository.save(c);
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c= new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setCelular(cliente.getCelularDTO());
		repository.saveAndFlush(c);

	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarCliente() {
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null; 
		for (Cliente cliente :repository.findAll()) {
			c = new ClienteDTOResponse();
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setNombreDTO(cliente.getNombre());
			c.setCelularDTO(cliente.getCelular());

			lista.add(c);
			
		}
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		Cliente cliente = repository.findById(id).orElse(null);
		ClienteDTOResponse c = new ClienteDTOResponse();
	
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		c.setCelularDTO(cliente.getCelular());
		return c;
	}

}

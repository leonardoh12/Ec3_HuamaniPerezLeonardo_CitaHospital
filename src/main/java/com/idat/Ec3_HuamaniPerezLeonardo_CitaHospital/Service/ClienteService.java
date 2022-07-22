package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Service;

import java.util.List;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.ClienteDTORequest;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.ClienteDTOResponse;



public interface ClienteService {

	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	public void eliminarCliente(Integer id);
	public List<ClienteDTOResponse> listarCliente();
	public ClienteDTOResponse obtenerClienteId(Integer id);
	
}

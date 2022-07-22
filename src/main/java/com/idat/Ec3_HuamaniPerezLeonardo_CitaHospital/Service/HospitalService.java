package com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.Service;

import java.util.List;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.HospitalDTORequest;
import com.idat.Ec3_HuamaniPerezLeonardo_CitaHospital.dto.HospitalDTOResponse;


public interface HospitalService {

	public void guardarHospital(HospitalDTORequest hospital);
	public void editarHospital(HospitalDTORequest hospital);
	public void eliminarHospital(Integer id);
	public List<HospitalDTOResponse> listarHospital();
	public HospitalDTOResponse obtenerHospitalId(Integer id);
	
}

package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Hospital;

public interface HospitalService {
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar (Integer id );
	List<Hospital> listar ();
	Hospital obtener (Integer id);
}

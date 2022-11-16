package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Rivera.Model.Hospital;




public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar (Integer id );
	List<Hospital> listar ();
	Hospital obtener (Integer id);
}

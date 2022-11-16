package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Rivera.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar (Integer id );
	List<Cliente> listar ();
	Cliente obtener (Integer id);
}

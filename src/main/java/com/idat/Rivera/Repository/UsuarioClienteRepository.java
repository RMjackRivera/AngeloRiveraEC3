package com.idat.Rivera.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Rivera.Model.UsuarioCliente;



public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{
	void guardar(UsuarioCliente usuariocliente);
	void actualizar(UsuarioCliente usuariocliente);
	void eliminar (Integer id );
	List<UsuarioCliente> listar ();
	UsuarioCliente obtener (Integer id);
}

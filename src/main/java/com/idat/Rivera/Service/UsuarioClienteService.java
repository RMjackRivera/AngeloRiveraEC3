package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.UsuarioCliente;

public interface UsuarioClienteService {
	void guardar(UsuarioCliente usuariocliente);
	void actualizar(UsuarioCliente usuariocliente);
	void eliminar (Integer id );
	List<UsuarioCliente> listar ();
	UsuarioCliente obtener (Integer id);
}

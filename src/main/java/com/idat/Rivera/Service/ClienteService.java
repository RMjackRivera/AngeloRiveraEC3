package com.idat.Rivera.Service;

import java.util.List;

import com.idat.Rivera.Model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar (Integer id );
	List<Cliente> listar ();
	Cliente obtener (Integer id);
}

package com.algaworks.multidb.service;

import java.util.List;

import com.algaworks.multidb.model.auth.Usuario;

public interface UsuarioService {

	public List<Usuario> obterUsuarios();
	
	public Usuario criar(Usuario usuario);
}

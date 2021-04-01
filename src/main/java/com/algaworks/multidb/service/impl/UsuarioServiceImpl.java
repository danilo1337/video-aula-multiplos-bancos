package com.algaworks.multidb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.multidb.model.auth.Usuario;
import com.algaworks.multidb.repository.auth.UsuarioRepository;
import com.algaworks.multidb.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	@Override
	public List<Usuario> obterUsuarios() {
		return this.UsuarioRepository.findAll();
	}

	@Override
	public Usuario criar(Usuario Usuario) {
		return this.UsuarioRepository.save(Usuario);
	}
}

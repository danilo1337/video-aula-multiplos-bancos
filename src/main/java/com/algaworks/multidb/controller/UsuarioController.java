package com.algaworks.multidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.multidb.model.auth.Usuario;
import com.algaworks.multidb.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService UsuarioService;

	@GetMapping
	public List<Usuario> obterUsuarios() {
		return this.UsuarioService.obterUsuarios();
	}

	@PostMapping
	public ResponseEntity<Usuario> criar(@RequestBody Usuario Usuario) {
		
		try {
			
			return ResponseEntity
					.status(HttpStatus.CREATED)
					.body(this.UsuarioService.criar(Usuario));
			
		} catch (IllegalArgumentException e) {
			
			return ResponseEntity.badRequest().build();
		}
	}
}

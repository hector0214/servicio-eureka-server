package com.mx.java.android.main.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.mx.java.android.main.models.entity.Usuario;
import com.mx.java.android.main.models.service.InterUsuarioService;

@RestController
@RequestMapping("/server")
public class ControllerRest {
	@Autowired
	private InterUsuarioService usuarioService;
	
	Logger log = LogManager.getLogger(ControllerRest.class);
	
	@GetMapping (value ="test")
	public String test() {
		return "Hello World";
	}
	
	@GetMapping(value="/usuarios")
	public List<Usuario> suarios() {
		return usuarioService.findAll();
	}
	
	@PostMapping(value="/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario inforUsuario(@RequestBody Usuario toUsuario) {
		return usuarioService.findBy(toUsuario.getIdUsuario());
	}
	
	@PostMapping(value = "/login")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario loginUsuario1(@RequestBody Usuario toUsuario) {
		return usuarioService.loginBy(toUsuario);
	}
	
	@PostMapping(value = "/creaUsuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario creaUsuario(@RequestBody Usuario toUsuario) {
		return usuarioService.save(toUsuario);
	}
	
	@PostMapping(value = "/recuperaPassword")
	@ResponseStatus(HttpStatus.CREATED)
	public Boolean recuperaPassword(@RequestBody Usuario toUsuario) {
		return usuarioService.updatePassword(toUsuario);
	}
	
	@PostMapping(value = "/actualizarUsuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario actualizarUsuario(@RequestBody Usuario toUsuario) {
		return usuarioService.save(toUsuario);
	}
}
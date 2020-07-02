package com.mx.java.android.main.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.java.android.main.models.entity.Usuario;
import com.mx.java.android.main.models.service.InterUsuarioService;
import com.mx.java.android.main.response.ResponseLogin;

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
	
	
	
	@PostMapping(value="/usuarioLogin")
	public Usuario loginUsuario(@RequestBody Usuario toUsuarioLogin) {
		return usuarioService.findBy(toUsuarioLogin.getIdUsuario());
		
	}
	
	@PostMapping(value = "/login")
	public ResponseLogin activadorIntegrador(@RequestBody Usuario toUsuario) {
		ResponseLogin poResponseLogin= new ResponseLogin();
		
		Usuario poUsuario=usuarioService.loginBy(toUsuario);
		if(poUsuario!=null && poUsuario.getIdUsuario()!=null) {
			poResponseLogin.setIdUsuario(poUsuario.getIdUsuario());
			poResponseLogin.setEstatus(true);
		}else {
			poResponseLogin.setError("Usuario o Contraseña incorrectos");
			poResponseLogin.setEstatus(false);
		}
		return poResponseLogin;
	}
	
	
	/*
	@PostMapping(value = "/login")
	public ResponseLogin activadorIntegrador(@RequestBody Usuario toUsuarioLogin) {
		ResponseLogin poResponseLogin= new ResponseLogin();
		
		if(toUsuarioLogin.getPassword().toString().equals("12300")&&toUsuarioLogin.getUsuario().toString().equals("123456")) {
			poResponseLogin.setEstatus(true);
			poResponseLogin.setIdUsuario("123456");
		}else {
			poResponseLogin.setError("Usuario no validao");
			poResponseLogin.setEstatus(false);
		}
		
		return poResponseLogin;
	}*/
	/*@PostMapping(value = "/modulos")
	public List<RepondeModulos> activadorIntegrador(@RequestBody UsuarioGeneral toUsuarioGeneral) {
		List<RepondeModulos> poResponseGeneral= new ArrayList<RepondeModulos>();
		RepondeModulos temp = new RepondeModulos();
		temp.setDescripcion("Descripcion del modulo");
		temp.setEstatus(true);
		temp.setIdModulo(1);
		temp.setNombre("Pruebas");
		poResponseGeneral.add(temp);
		return poResponseGeneral;
	}*/
}

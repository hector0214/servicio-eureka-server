package com.mx.java.android.main.models.service;

import java.util.List;

import com.mx.java.android.main.models.entity.Usuario;

public interface InterUsuarioService {
	
	public  List<Usuario> findAll();
	
	public Usuario findBy(Integer idUsuario);
	
	public Usuario loginBy(Usuario poUsuario);
	
}
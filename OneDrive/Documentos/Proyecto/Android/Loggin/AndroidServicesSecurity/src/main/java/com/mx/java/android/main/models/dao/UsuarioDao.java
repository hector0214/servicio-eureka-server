package com.mx.java.android.main.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.java.android.main.models.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Integer>{
	
}
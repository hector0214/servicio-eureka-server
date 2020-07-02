package com.mx.java.android.main.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mx.java.android.main.models.entity.Usuario;

public interface UsuarioDaoImpl extends JpaRepository<Usuario, Usuario>{
	
	@Query(value = "SELECT * FROM Usuario WHERE (ST_CORREO = ?1 OR ST_USUARIO=?1) AND ST_PASSWORD=?2", nativeQuery = true)
	Usuario findByLogin(String stUsuario, String stPassword);
	
}

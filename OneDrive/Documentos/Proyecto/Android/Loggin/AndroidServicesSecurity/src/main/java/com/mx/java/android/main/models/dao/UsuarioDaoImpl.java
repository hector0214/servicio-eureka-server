package com.mx.java.android.main.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mx.java.android.main.models.entity.Usuario;

public interface UsuarioDaoImpl extends JpaRepository<Usuario, Usuario>{
	
	@Query(value = "SELECT * FROM Usuario WHERE (ST_CORREO = ?1 OR ST_USUARIO=?1) AND ST_PASSWORD=?2", nativeQuery = true)
	Usuario findByLogin(String stUsuario, String stPassword);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "UPDATE Usuario SET ST_PASSWORD=?3 WHERE ST_USUARIO=?1 AND ST_CORREO = ?2", nativeQuery = true)
	Integer updatePassword(String stUsuario, String stCorreo,String stPassword);
	
	
}

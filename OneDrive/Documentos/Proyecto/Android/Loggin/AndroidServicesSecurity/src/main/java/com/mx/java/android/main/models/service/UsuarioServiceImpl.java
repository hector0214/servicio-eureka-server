package com.mx.java.android.main.models.service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.java.android.main.models.dao.UsuarioDao;
import com.mx.java.android.main.models.dao.UsuarioDaoImpl;
import com.mx.java.android.main.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements InterUsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private UsuarioDaoImpl usuarioDaoImpl;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findBy(Integer idUsuario) {
		return usuarioDao.findById(idUsuario).orElse(null);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Usuario loginBy(Usuario poUsuario) {
		return usuarioDaoImpl.findByLogin(poUsuario.getUsuario(), DigestUtils.md5Hex(poUsuario.getPassword().toString()));
	}

}
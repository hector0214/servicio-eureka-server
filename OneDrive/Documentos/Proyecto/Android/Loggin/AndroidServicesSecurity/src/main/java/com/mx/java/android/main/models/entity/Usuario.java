package com.mx.java.android.main.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IN_ID_USUARIO")
	private Integer inIdUsuario;
	@Column(name="ST_NOMBRE")
	private String stNombre;
	@Column(name="ST_APELLIDOP")
	private String stApellidoP;
	@Column(name="ST_APELLIDOM")
	private String stApellidoM;
	@Column(name="ST_USUARIO")
	private String stUsuario; 
	@Column(name="ST_CORREO")
	private String stCorreo;
	@Column(name="ST_PASSWORD")
	private String stPassword;
	
	public Integer getIdUsuario() {
		return inIdUsuario;
	}
	public void setIdUsuario(Integer inIdUsuario) {
		this.inIdUsuario = inIdUsuario;
	}
	public String getNombre() {
		return stNombre;
	}
	public void setNombre(String stNombre) {
		this.stNombre = stNombre;
	}
	public String getApellidoP() {
		return stApellidoP;
	}
	public void setApellidoP(String stApellidoP) {
		this.stApellidoP = stApellidoP;
	}
	public String getApellidoM() {
		return stApellidoM;
	}
	public void setApellidoM(String stApellidoM) {
		this.stApellidoM = stApellidoM;
	}
	public String getUsuario() {
		return stUsuario;
	}
	public void setUsuario(String stUsuario) {
		this.stUsuario = stUsuario;
	}
	public String getCorreo() {
		return stCorreo;
	}
	public void setCorreo(String stCorreo) {
		this.stCorreo = stCorreo;
	}
	public String getPassword() {
		return stPassword;
	}
	public void setPassword(String stPassword) {
		this.stPassword = stPassword;
	}
	
	private static final long serialVersionUID = -1416747196105769092L;
}
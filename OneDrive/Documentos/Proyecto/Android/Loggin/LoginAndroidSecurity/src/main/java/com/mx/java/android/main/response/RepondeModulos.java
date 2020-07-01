package com.mx.java.android.main.response;

public class RepondeModulos {
	private Integer inIdModulo;
	private String stNombre;
	private String stDescripcion;
	private Boolean blEstatus;
	
	public Integer getIdModulo() {
		return inIdModulo;
	}
	public void setIdModulo(Integer inIdModulo) {
		this.inIdModulo = inIdModulo;
	}
	public String getNombre() {
		return stNombre;
	}
	public void setNombre(String stNombre) {
		this.stNombre = stNombre;
	}
	public String getDescripcion() {
		return stDescripcion;
	}
	public void setDescripcion(String stDescripcion) {
		this.stDescripcion = stDescripcion;
	}
	public Boolean getEstatus() {
		return blEstatus;
	}
	public void setEstatus(Boolean blEstatus) {
		this.blEstatus = blEstatus;
	}
}
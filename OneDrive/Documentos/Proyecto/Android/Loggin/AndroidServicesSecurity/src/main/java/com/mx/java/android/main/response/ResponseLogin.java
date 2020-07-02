package com.mx.java.android.main.response;

public class ResponseLogin {
	private Boolean blEstatus;
	private String stError;
	private Integer stIdUsuario;
	
	public Boolean getEstatus() {
		return blEstatus;
	}
	public void setEstatus(Boolean blEstatus) {
		this.blEstatus = blEstatus;
	}
	public String getError() {
		return stError;
	}
	public void setError(String stError) {
		this.stError = stError;
	}
	public Integer getIdUsuario() {
		return stIdUsuario;
	}
	public void setIdUsuario(Integer stIdUsuario) {
		this.stIdUsuario = stIdUsuario;
	}
	
}
package com.tienda.online.Microservicioventasonline;

public class Greeting {
	
	private long id;
	private String mensaje;
	
	public Greeting(long id, String mensaje) {
		this.id = id;
		this.mensaje = mensaje;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}

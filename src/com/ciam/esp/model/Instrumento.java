package com.ciam.esp.model;

public class Instrumento {

	private String nombre;
	private String tipo;
	private String sonido;
	private String imagen;
	public Instrumento(String nombre, String tipo, String sonido, String imagen) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.sonido = sonido;
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getSonido() {
		return sonido;
	}
	public String getImagen() {
		return imagen;
	}
	
	
}

package com.ciam.esp.model;

public class Musico extends Persona {

	private Instrumento instrumento;
	
	public Musico(String nombre, int edad, Instrumento instrumento) {
		super(nombre, edad);
		this.instrumento= instrumento;
	}
	
	public Instrumento getInstrumento() {
		return instrumento;
	}

	@Override
	public String toString() {
		return "Musico [instrumento=" + instrumento + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	
}

package com.ciam.esp.controller;

import com.ciam.esp.model.Instrumento;
import com.ciam.esp.model.Musico;

public class Mediator {
	//Delete default contructor, make the create method for singleton
	public Mediator() {
		super();
		
	}

	public Musico createRandomMusico() {

		int randomTipoInstrumento = (int) (Math.random() * ( 6 - 1 ));
		int randomEdad = (int) (Math.random() * ( 101 - 18 ));
		String tipoInstrumento;
		String nombre;
		Instrumento instrumento;
		
		switch (randomTipoInstrumento) {
		        case 1:
		        	tipoInstrumento="voz";
		        	instrumento=new Instrumento("voz",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        case 2:
		        	tipoInstrumento="percusion";
		        	instrumento=new Instrumento("tambor",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        case 3:
		        	tipoInstrumento="melodia cuerdas";
		        	instrumento=new Instrumento("guitarra",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        case 4:
		        	tipoInstrumento="bajo";
		        	instrumento=new Instrumento("bajo",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        case 5:
		        	tipoInstrumento="viento";
		        	instrumento=new Instrumento("saxofon",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        case 6:
		        	tipoInstrumento="teclado";
		        	instrumento=new Instrumento("piano",tipoInstrumento,"pathToSound","pathToImage");
		        	break;
		        default:
		        	tipoInstrumento="melodia cuerdas";
		        	instrumento=new Instrumento("guitarra",tipoInstrumento,"pathToSound","pathToImage");
		        	break;

		 }
		nombre="quien toca "+tipoInstrumento;
		
		Musico musico=new Musico(nombre, randomEdad, instrumento);
		return musico;
	}
	
}

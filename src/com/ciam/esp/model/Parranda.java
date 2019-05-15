package com.ciam.esp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.ciam.esp.controller.Mediator;

public class Parranda {
	
	private ArrayList<Musico> musicos;
	private Mediator mediator;
	
	public Parranda() {
		super();
		this.mediator=new Mediator();
		this.musicos=new ArrayList<>();
	}
	
	
	public ArrayList CreateParranda() {
		
		int numeroIntegrantes = (int) (Math.random() * ( 21 - 1 ));		
		for(int i=0;i<numeroIntegrantes;i++) {
			Musico musico= mediator.createRandomMusico();
			musicos.add(musico);
			
		}
		
		return musicos;
		
		
	}


	@Override
	public String toString() {
		String res="MUSICOS DE LA PARRANDA:: ";
		for(int x=0;x<musicos.size();x++) {
			  //System.out.println(musicos.get(x));
			  res=res+musicos.get(x).getNombre()+", "+musicos.get(x).getEdad()+", "+musicos.get(x).getInstrumento().getNombre()+"; ";
			}
		return res;
	}


}

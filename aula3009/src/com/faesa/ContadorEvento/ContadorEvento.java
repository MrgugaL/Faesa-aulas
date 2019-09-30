package com.faesa.ContadorEvento;

public class ContadorEvento {

	private int contador;
	
	public void zerarContador (){
		contador=0;
	}
	
	
	public void incrementar(){
		contador++;
	}
	public int getContador(){
		return contador;
	}
	public void decrementar (){
		contador --;
	}
}

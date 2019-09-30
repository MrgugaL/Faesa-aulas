package com.faesa.ContadorEvento;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ContadorEvento contador = new ContadorEvento();

contador.getContador();
System.out.println(contador.getContador());
	contador.decrementar();
	contador.decrementar();
	System.out.println(contador.getContador());
	
	contador.decrementar();
	System.out.println(contador.getContador());
	}

}

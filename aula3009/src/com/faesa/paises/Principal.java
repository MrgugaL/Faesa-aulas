package com.faesa.paises;

public class Principal {

	public static void main(String[] args) {
Pais Brasil = new Pais ();

Brasil.setIso("3166-1");
Brasil.setNome("Brasil");
Brasil.setPopulacao(209300000);
Brasil.setDimensao(8515767);
	

Pais [] vizinho = new  Pais [10];
System.out.println("");
String nomeVizinho[]= {"Uruguai","Colombia","Argentina","Bolivia","Guiana",
		"Suriname","Guiana Francesa","Venezuela","Paraguai","Peru"};

for (int i = 0; i < vizinho.length; i++) {
	vizinho [i] = new Pais();
	vizinho [i].setNome (nomeVizinho[i]);
	
}
System.out.println("");
	Brasil.setVizinho(vizinho);
	
	System.out.println(Brasil.toString());
	}

}

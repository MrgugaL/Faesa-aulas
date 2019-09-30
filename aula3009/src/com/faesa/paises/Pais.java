package com.faesa.paises;

public class Pais {
	private String nome;
	private int populacao;
	private double dimensao;
	private Pais[] vizinho;
	private String iso;

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public void setVizinho(Pais[] vizinho) {
		this.vizinho = vizinho;
	}

	public String getVizinho(){
		StringBuilder vizinhaca = new StringBuilder();
for (int i = 0; i < vizinho.length; i++) {
	vizinhaca.append(vizinho[i].nome + " ");
	
}
return vizinhaca.toString();
	}
public String toString(){
	StringBuilder texto = new  StringBuilder() ;
	texto.append("iso: "+ this.getIso() + "\n").
	append("Nome: " + this.getNome() + "\n").
	append("População: " + this.getPopulacao() + "\n").
	append("Dimensão: "+getDimensao()+ "\n").
	append("Vizinhos: "+ getVizinho()+ "\n");
	
	return texto.toString();
}
}

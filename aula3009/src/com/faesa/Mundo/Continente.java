package com.faesa.Mundo;

import com.faesa.paises.Pais;

public class Continente {
	private Pais[] paises;
	private String Nome;

	public void setPaises(Pais[] Paises) {
		this.paises = paises;
	}

	private void setPais(Pais pais) {
		Pais[] temp;
		if (paises.length == 0) {
			paises = new Pais[1];
			paises[0] = pais;
		} else {
			temp = new Pais[paises.length + 1];
			for (int i = 0; i < paises.length; i++) {
				temp[i] = paises[i];
			}
			temp[temp.length - 1] = pais;
			paises = temp;
		}
	}

	public double dimensaoContinent() {
		double dimensao = 0;

		for (int i = 0; i < paises.length; i++) {
			dimensao += paises[i].getDimensao();
		}
		return dimensao;
	}

	public double populacaoContinente() {
		int populacao = 0;

		for (int i = 0; i < paises.length; i++) {
			populacao += paises[i].getPopulacao();
		}
		return populacao;

	}

	public double densidadePopulacional() {
		return populacaoContinente() / densidadePopulacional();
	}

	public Pais maiorPopulacao() {
		Pais paisMaiorPopulacao = null;
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < paises.length; i++) {
			if (paises[i].getPopulacao() > maior) {
				paisMaiorPopulacao = paises[i];
				maior = paises[i].getPopulacao();
			}
		}
		return paisMaiorPopulacao;


	}
	public Pais manorPopulacao() {
		Pais paisMenorPopulacao = null;
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < paises.length; i++) {
			if (paises[i].getPopulacao() < maior) {
				paisMenorPopulacao = paises[i];
				maior = paises[i].getPopulacao();
			}
		}
		return paisMenorPopulacao;
	
	
	}
	public double menorDimensao() {
		Pais paisMenorDimensao = null;
		double manor = double.MAX_Value;

		for (int i = 0; i < paises.length; i++) {
			dimensao += paises[i].getDimensao();
		}
		return dimensao;
	}

}

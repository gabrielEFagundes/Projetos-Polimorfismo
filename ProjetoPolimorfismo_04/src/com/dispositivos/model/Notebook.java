package com.dispositivos.model;

public class Notebook extends Dispositivo{

	private int tamanhoTela;
	
	public Notebook(String nome, int tamanhoTela) {
		super(nome);
		this.tamanhoTela = tamanhoTela;
	}
	
	@Override
	public String toString() {
		return ("| - Notebook: " + nome + "         |"
				+ "\n| - Tela: " + tamanhoTela + "pol.          |");
	}
	
}

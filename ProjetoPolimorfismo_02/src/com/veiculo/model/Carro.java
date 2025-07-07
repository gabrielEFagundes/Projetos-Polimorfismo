package com.veiculo.model;

public class Carro extends Veiculo{
	
	private int numPortas;
	
	public Carro(String marca, int numPortas) {
		super(marca);
		this.numPortas = numPortas;
	}
	
	@Override
	public String toString() {
		return ("Carro: " + marca
				+ " - Número de portas: " + numPortas);
	}

}

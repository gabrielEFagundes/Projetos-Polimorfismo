package com.veiculo.model;

public class Carro extends Veiculo{
	
	private String numPortas;
	
	public Carro(String marca, String numPortas) {
		super(marca);
		this.numPortas = numPortas;
	}
	
	@Override
	public String toString() {
		return ("Carro: " + marca
				+ " - Número de portas: " + numPortas);
	}

}

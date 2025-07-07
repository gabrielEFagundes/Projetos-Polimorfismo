package com.banco.model;

public class Conta {
	
	protected int numero;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return ("Conta número: " + numero);
	}

}

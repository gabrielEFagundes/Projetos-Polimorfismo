package com.animais.model;

public class Gato extends Animal{
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return ("Gato: " + nome + " - Miau!");
	}

}

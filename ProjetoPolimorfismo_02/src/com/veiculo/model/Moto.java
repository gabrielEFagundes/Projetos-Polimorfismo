package com.veiculo.model;

public class Moto extends Veiculo{

	private boolean temCarenagem;
	
	public Moto(String marca, boolean temCarenagem) {
		super(marca);
		this.temCarenagem = temCarenagem;
	}
	
	@Override
	public String toString() {
		return ("Moto: " + marca
				+ " - Carenagem: " + temCarenagem);
	}
	
}

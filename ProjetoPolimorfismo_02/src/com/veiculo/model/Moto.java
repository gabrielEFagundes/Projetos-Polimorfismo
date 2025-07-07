package com.veiculo.model;

public class Moto extends Veiculo{

	private boolean temCarenagem;
	
	public Moto(String marca, boolean temCarenagem) {
		super(marca);
		this.temCarenagem = temCarenagem;
	}
	
	@Override
	public String toString() {
		
		if(temCarenagem == true) {
			return ("Moto: " + marca
					+ " - Carenagem: Sim!");
		}else {
			return ("Moto: " + marca
					+ " - Carenagem: Não!");
		}
	}
	
}

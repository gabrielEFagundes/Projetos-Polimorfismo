package com.veiculo.services;

import com.veiculo.model.*;
import com.veiculo.view.Visualizacao;

import java.util.List;

public class Servico {
	
	Veiculo veiculo;
	
	public Veiculo addVeiculo(List<Veiculo> veiculos) {
		veiculo = new Veiculo("BYD");
		
		veiculos.add(veiculo);
		
		return veiculo;
	}
	
	public Veiculo addCarro(List<Veiculo> veiculos) {
		veiculo = new Carro("Chevrolet", 4);
		
		veiculos.add(veiculo);
		
		return veiculo;
	}
	
	public Veiculo addMoto(List<Veiculo> veiculos) {
		veiculo = new Moto("Honda", false);
		
		veiculos.add(veiculo);
		
		return veiculo;
	}

}

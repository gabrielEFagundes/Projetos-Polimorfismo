package com.veiculo;

import com.veiculo.model.*;
import com.veiculo.services.Servico;
import com.veiculo.view.Visualizacao;

import java.util.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String [] args) {
		
		List<Veiculo> veiculos = new ArrayList<>();
		Servico servico = new Servico();
		Visualizacao view = new Visualizacao();
		
		servico.addVeiculo(veiculos);
		servico.addCarro(veiculos);
		servico.addMoto(veiculos);
		
		view.verVeiculos(veiculos);
		
	}

}

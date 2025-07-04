package com.animais;

import java.util.ArrayList;
import java.util.List;

import com.animais.model.*;
import com.animais.services.Servico;
import com.animais.view.Visualizacao;

public class App {

	public static void main(String [] args) {
		
		List<Animal> animais = new ArrayList<>();
		
		Servico servico = new Servico();
		Visualizacao view = new Visualizacao();
		
		servico.addAnimal(animais);
		servico.addCachorro(animais);
		servico.addGato(animais);	
		
		view.verAnimais(animais);
		
	}
	
}

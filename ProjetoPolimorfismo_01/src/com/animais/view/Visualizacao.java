package com.animais.view;

import com.animais.services.Servico;
import com.animais.model.*;

import java.util.List;

public class Visualizacao {
	
	Servico servico = new Servico();
	
	public void verAnimais(List<Animal> animais) {
		
			System.out.println(animais);
			
	}

}

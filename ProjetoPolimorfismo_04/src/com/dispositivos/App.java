package com.dispositivos;

import com.dispositivos.model.*;
import com.dispositivos.services.Estoque;
import com.dispositivos.view.Interface;

import java.util.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String [] args) {
		
		List<Dispositivo> dispositivos = new ArrayList<>();
		Estoque estoque = new Estoque();
		Interface view = new Interface();
		
		estoque.addDispositivo(dispositivos);
		estoque.addSmartphone(dispositivos);
		estoque.addNotebook(dispositivos);
		
		view.verDispositivos(dispositivos);
		
		/*
		 * tentei fazer fru fru nessa aqui, então os métodos toString estão meio meh
		 */
	}

}

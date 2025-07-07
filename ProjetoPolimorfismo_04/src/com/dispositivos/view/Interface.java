package com.dispositivos.view;

import com.dispositivos.model.Dispositivo;
import com.dispositivos.services.Estoque;

import java.util.List;

public class Interface {

	public void verDispositivos(List<Dispositivo> dispositivos) {
		System.out.println("+-------------------------+");
		
		for(Dispositivo i : dispositivos) {
			System.out.println(i);
		}
		
		System.out.println("+-------------------------+");
	}
	
}

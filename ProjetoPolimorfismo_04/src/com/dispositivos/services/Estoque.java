package com.dispositivos.services;

import com.dispositivos.App;
import com.dispositivos.model.*;

import java.util.List;

public class Estoque {

	Dispositivo device;
	
	public Dispositivo addDispositivo(List<Dispositivo> dispositivos) {
		device = new Dispositivo("Samsumg");
		
		dispositivos.add(device);
		
		return device;
	}
	
	public Dispositivo addSmartphone(List<Dispositivo> dispositivos) {
		device = new Smartphone("Apple", "iOS");
		
		dispositivos.add(device);
		
		return device;
	}
	
	public Dispositivo addNotebook(List<Dispositivo> dispositivos) {
		device = new Notebook("AMD", 18);
		
		dispositivos.add(device);
		
		return device;
	}
	
}

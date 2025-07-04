package com.animais.services;

import com.animais.model.*;

import java.util.List;
import java.util.ArrayList;

public class Servico {

	Animal animal;
	
	public Animal addAnimal(List<Animal> animais) {
		animal = new Animal("Coelho");
		
		animais.add(animal);
		
		return animal;
	}
	
	public Animal addCachorro(List<Animal> animais) {
		animal = new Cachorro("Neni");
		
		animais.add(animal);
		
		return animal;
	}
	
	public Animal addGato(List<Animal> animais) {
		animal = new Gato("Caco");
		
		animais.add(animal);
		
		return animal;
	}
	
}

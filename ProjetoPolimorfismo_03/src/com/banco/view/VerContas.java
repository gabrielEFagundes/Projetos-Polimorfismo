package com.banco.view;

import com.banco.model.*;

import java.util.List;

public class VerContas {

	public void visualizarContas(List<Conta> contas) {
		for(Conta i : contas) {
			System.out.println("-------------------------------------------");
			System.out.println(i);
		}
	}
	
}

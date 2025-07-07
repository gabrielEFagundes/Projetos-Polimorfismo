package com.banco;

import com.banco.model.*;
import com.banco.services.GerenciamentoBancario;
import com.banco.view.VerContas;

import java.util.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String [] args) {
		
		List<Conta> contas = new ArrayList<>();
		GerenciamentoBancario gerenciamento = new GerenciamentoBancario();
		VerContas view = new VerContas();
		
		gerenciamento.addConta(contas);
		gerenciamento.addContaCorrente(contas);
		gerenciamento.addContaPoupanca(contas);
		
		view.visualizarContas(contas);
		
	}

}

package com.banco.services;

import com.banco.App;
import com.banco.model.*;

import java.util.List;

public class GerenciamentoBancario {
	
	Conta conta;
	
	public Conta addConta(List<Conta> contas) {
		conta = new Conta(1);
		
		contas.add(conta);
		
		return conta;
	}
	
	public Conta addContaCorrente(List<Conta> contas) {
		conta = new ContaCorrente(2, 400.00);
		
		contas.add(conta);
		
		return conta;
	}
	
	public Conta addContaPoupanca(List<Conta> contas) {
		conta = new ContaPoupanca(3, 30);
		
		contas.add(conta);
		
		return conta;
	}

}

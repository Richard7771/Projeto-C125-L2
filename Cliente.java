package br.inatel.C125.Cliente;

import br.inatel.C125.Cliente.Conta.Conta;

public class Cliente {
	 String nome;
	 long CPF;
	 Conta conta;
	 long numCell;
	
	public Cliente(String nome, long cPF, long numCell) {
		this.nome = nome;
		this.CPF = cPF;
		this.numCell = numCell;
	}

	public String getNome() {
		return nome;
	}

	public long getCPF() {
		return CPF;
	}

	public Conta getConta() {
		return conta;
	}

	public long getNumCell() {
		return numCell;
	}
	
	
	
	
}

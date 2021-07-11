package br.inatel.C125.Cliente.Conta;

import br.inatel.C125.Cliente.Cliente;

public class ContaCorrente extends Conta  {

	public ContaCorrente(Cliente cliente, double saldo, double limite) {
		super(cliente, saldo, limite);
	}

	@Override
	public void mostraInfo() {
		System.out.println("Informações da conta corrente: " );
		System.out.println("Nome do titular: " + this.getCliente().getNome());
		System.out.println("CPF: " + this.getCliente().getCPF());
		System.out.println("Número de contato: " + this.getCliente().getNumCell());
		System.out.println("Saldo: " + this.saldo + " reais");
		System.out.println("Limite: " + this.limite + " reais");
	}

}

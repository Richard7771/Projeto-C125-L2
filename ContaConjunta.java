package br.inatel.C125.Cliente.Conta;

import br.inatel.C125.Cheque.TransferirTitularidade;
import br.inatel.C125.Cliente.Cliente;

public class ContaConjunta extends Conta implements TransferirTitularidade {
	
	private Cliente cliente2;

	public ContaConjunta(Cliente cliente,Cliente cliente2, double saldo, double limite) {
		super(cliente, saldo, limite);
		this.cliente2 = cliente2;
	}

	public static void main(String[] args) {

	}

	@Override
	public void mostraInfo() {
		System.out.println("Informações da Conta Conjunta: ");
		System.out.println("Nome do titular: " + this.getCliente().getNome());
		System.out.println("CPF: " + this.getCliente().getCPF());
		System.out.println("Nome do titular: " +this.getCliente2().getNome());
		System.out.println("CPF: " + this.getCliente2().getCPF());
		System.out.println("Saldo: " + this.saldo + " reais");
		System.out.println("Limite: " + this.limite + " reais");
	}

	@Override
	public void transferirTitularidade(Cliente cliente) {
		this.cliente2 = cliente;
	}
	public Cliente getCliente2() {
		return cliente2;
	}
		
	}


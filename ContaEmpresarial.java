package br.inatel.C125.Cliente.Conta;

import br.inatel.C125.Cliente.Cliente;

public class ContaEmpresarial extends Conta {
	
	private long CNPJ;
	private String empresa;
	
	public ContaEmpresarial(Cliente cliente,String empresa,long CNPJ, double saldo, double limite) {
		super(cliente, saldo, limite);
		this.CNPJ = CNPJ;
	}

	@Override
	public void mostraInfo() {
		System.out.println("Informações da Conta Empresarial, da empresa " + this.empresa);
		System.out.println("CNPJ: " + this.CNPJ);
		System.out.println("Saldo: " + this.saldo + " reais");
		System.out.println("Limite: " + this.limite + " reais");
		System.out.println("Nome do representante: " + this.getCliente().getNome());
	}

	
	

	

}

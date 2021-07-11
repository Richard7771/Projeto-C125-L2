package br.inatel.C125;

import br.inatel.C125.Cliente.Cliente;
import br.inatel.C125.Cliente.Conta.Conta;
import br.inatel.C125.Cliente.Conta.ContaConjunta;
import br.inatel.C125.Cliente.Conta.Exception.SaldoInsuficienteExceptions;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jubiscleide", 123456, 34718978);
		Cliente cliente2 = new Cliente("Robervaldo", 654321, 34719802);
		Cliente cliente3 = new Cliente("Persilval", 7654, 473443);
		
		Conta conta = new ContaConjunta(cliente, cliente2, 20, 10);
		
		conta.mostraInfo();
		try {
			conta.sacar(40);
			System.out.println("");
			conta.mostraInfo();
		} catch (SaldoInsuficienteExceptions e) {
			System.out.println(e.getMsg());
		}
		
		
	}

}

package br.inatel.C125.Cliente.Conta.Exception;

import br.inatel.C125.Cliente.Cliente;
import br.inatel.C125.Cliente.Conta.Conta;

public class SaldoInsuficienteExceptions extends RuntimeException {
	
	private String msg;
	
	public SaldoInsuficienteExceptions(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

}

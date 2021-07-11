package br.inatel.C125.Cliente.Conta;

import br.inatel.C125.Cliente.Cliente;
import br.inatel.C125.Cliente.Conta.Exception.SaldoInsuficienteExceptions;

public abstract class Conta {

	protected Cliente cliente;
	protected double saldo;
	protected double limite;
	
	public Conta(Cliente cliente, double saldo, double limite) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}

	public void sacar(double quantia) {
		if(quantia > this.saldo) {
			if(quantia > (this.saldo + this.limite))
				throw new SaldoInsuficienteExceptions("Impossível realizar está operação, pois o saldo é insuficiente!");
			else {
				this.limite -= (quantia - this.saldo);
				this.saldo = 0;
			}
		}
		else
			this.saldo -= quantia;
	}
	
	public void deposita(double quantia) {
		this.saldo += quantia;
	}
	
	void transferir(double quantia, Conta contaDestino) {
		this.saldo -= quantia;
		contaDestino.deposita(quantia);
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}
	
	public abstract void mostraInfo(); 
	
	public Cliente getCliente() {
		return cliente;
	}
	
}

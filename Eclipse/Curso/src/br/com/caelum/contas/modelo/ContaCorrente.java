package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	public void sacar(double valor) {
		super.sacar(valor + 0.10);
		// setSaldo(getSaldo() - 0.10);
		// super.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.1;
	}
}

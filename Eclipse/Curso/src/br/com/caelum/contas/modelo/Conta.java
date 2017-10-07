package br.com.caelum.contas.modelo;

/**
 * conta para um caixa eletronico
 * 
 * @author bruno
 *
 */

public abstract class Conta {
	private String titular;
	private int numero;
	private String agencia;
	/* protected */private double saldo;
	private String abertura;
	private Data dataDeAbertura;

	/**
	 * Parametro para colocar o Titular na conta
	 * 
	 * @param titular
	 *            tem que ser ums string
	 */

	/* Construtor */
	// public Conta(String titular){
	// this.titular=titular;
	// }

	public void sacar(double valor) {
		verificaValorNegativo(valor);

		if (valor > getSaldo()) {
			throw new IllegalArgumentException("Saldo Insuficiente");
		} else {
			saldo -= valor;
		}
	}

	public void depositar(double valor) {
		verificaValorNegativo(valor);

		saldo += valor;

	}

	private void verificaValorNegativo(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar "
					+ "um valor negativo");
		}
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numero=" + numero
				+ ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abertura == null) ? 0 : abertura.hashCode());
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result
				+ ((dataDeAbertura == null) ? 0 : dataDeAbertura.hashCode());
		result = prime * result + numero;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (abertura == null) {
			if (other.abertura != null)
				return false;
		} else if (!abertura.equals(other.abertura))
			return false;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (dataDeAbertura == null) {
			if (other.dataDeAbertura != null)
				return false;
		} else if (!dataDeAbertura.equals(other.dataDeAbertura))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	
	
	

	/**
	 * 
	 * @return
	 */
	public double calculaRendimento() {
		double saldoRendimento;
		saldoRendimento = saldo * 0.1;
		return saldoRendimento;
	}

	public String recuperaDadosParaImpresao() {
		String dados = "Titular: " + this.titular;
		dados += "\n Numero: " + this.numero;
		dados += "\n Agencia: " + this.agencia;
		dados += "\n Saldo: " + this.saldo;
		dados += "\n Data de Abertura:" + this.abertura;
		return dados;
	}

	public String recuperaDadosParaImpresao2() {
		String dados = "Titular: " + this.titular;
		dados += "\n Numero: " + this.numero;
		dados += "\n Agencia: " + this.agencia;
		dados += "\n Saldo: " + this.saldo;
		dados += "\n Data de Abertura:" + this.abertura;
		dados += "\n Dia: " + this.dataDeAbertura.getDia();
		dados += "\n Mes: " + this.dataDeAbertura.getMes();
		dados += "\n Ano: " + this.dataDeAbertura.getAno();
		return dados;
	}

	public String recuperaDadosParaImpresao3() {
		String dados = "Titular: " + this.titular;
		dados += "\n Numero: " + this.numero;
		dados += "\n Agencia: " + this.agencia;
		dados += "\n Saldo: " + this.saldo;
		dados += "\n Data de Abertura:" + this.abertura;
		dados += "\n Dia: " + this.dataDeAbertura.getDia();
		dados += "\n Mes: " + this.dataDeAbertura.getMes();
		dados += "\n Ano: " + this.dataDeAbertura.getAno();
		dados += "\nData Formatada: " + this.dataDeAbertura.formatada();
		return dados;
	}

	public abstract String getTipo();

	// {
	// return "Conta";
	// }

	public void transfere(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	/***********************************************************************************************************************/

	public void setTitular(String titular) {
		this.titular = titular;
	};

	public String getTitular() {
		return this.titular;
	};

	public void setNumero(int numero) {
		this.numero = numero;
	};

	public int getNumero() {
		return this.numero;
	};

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	};

	public String getAgencia() {
		return this.agencia;
	};

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	};

	public double getSaldo() {
		return this.saldo;
	};

	public void setAbertura(String abertura) {
		this.abertura = abertura;
	};

	public String getAbertura() {
		return this.abertura;
	};

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	};

	public Data getDataDeAbertura() {
		return this.dataDeAbertura;
	}

}
/**/
class Conta{
private	String titular;
private	int numero;
private	String agencia;
private	double saldo;
private	String abertura;
private	Data dataDeAbertura;

public Conta(String titular){
	this.titular=titular;
}

void sacar(double valor){
	if(valor<=0){
		saldo-=valor;
	}else{
		System.out.println("Valor Invalido");
		}
}

void depositar(double valor){
	if(valor>0){
		saldo+=valor;
	}else{
		System.out.println("Valor Invalido");
		}
}

double calculaRendimento(){
	double saldoRendimento;	
	saldoRendimento = saldo*0.1;
	return saldoRendimento;
}

String recuperaDadosParaImpresao(){
	String dados = "Titular: " + this.titular;
	dados += "\n Numero: "+ this.numero;
	dados += "\n Agencia: "+ this.agencia;
	dados += "\n Saldo: "+ this.saldo;
	dados += "\n Data de Abertura:" + this.abertura;
return dados;
}
String recuperaDadosParaImpresao2(){
	String dados = "Titular: " + this.titular;
	dados += "\n Numero: "+ this.numero;
	dados += "\n Agencia: "+ this.agencia;
	dados += "\n Saldo: "+ this.saldo;
	dados += "\n Data de Abertura:" + this.abertura;
	dados +="\n Dia: " + this.dataDeAbertura.getDia();
	dados +="\n Mes: " + this.dataDeAbertura.getMes();
	dados +="\n Ano: " + this.dataDeAbertura.getAno();
return dados;
}

String recuperaDadosParaImpresao3(){
	String dados = "Titular: " + this.titular;
	dados += "\n Numero: "+ this.numero;
	dados += "\n Agencia: "+ this.agencia;
	dados += "\n Saldo: "+ this.saldo;
	dados += "\n Data de Abertura:" + this.abertura;
	dados +="\n Dia: " + this.dataDeAbertura.getDia();
	dados +="\n Mes: " + this.dataDeAbertura.getMes();
	dados +="\n Ano: " + this.dataDeAbertura.getAno();
	dados += "\nData Formatada: " + this.dataDeAbertura.formatada();
return dados;
}


/***********************************************************************************************************************/


public void setTitular(String titular){
	this.titular=titular;
};

public String getTitular(){
	return this.titular;
};

public void setNumero(int numero){
	this.numero=numero;
};

public int getNumero(){
	return this.numero;
};

public void setAgencia(String agencia){
	this.agencia=agencia;
};

public String getAgencia(){
	return this.agencia;
};

public void setSaldo(double saldo){
	this.saldo=saldo;
};

public double getSaldo(){
	return this.saldo;
};

public void setAbertura(String abertura){
	this.abertura=abertura;
};

public String getAbertura(){
	return this.abertura;
};

public void setDataDeAbertura(Data dataDeAbertura){
	this.dataDeAbertura=dataDeAbertura;
};

public Data getDataDeAbertura(){
	return this.dataDeAbertura;
};


}

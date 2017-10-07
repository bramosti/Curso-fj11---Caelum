/**/
class Conta{
	String titular;
	int numero;
	String agencia;
	double saldo;
	String abertura;
	Data dataDeAbertura;

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
	dados +="\n Dia: " + this.dataDeAbertura.dia;
	dados +="\n Mes: " + this.dataDeAbertura.mes;
	dados +="\n Ano: " + this.dataDeAbertura.ano;
return dados;
}

String recuperaDadosParaImpresao3(){
	String dados = "Titular: " + this.titular;
	dados += "\n Numero: "+ this.numero;
	dados += "\n Agencia: "+ this.agencia;
	dados += "\n Saldo: "+ this.saldo;
	dados += "\n Data de Abertura:" + this.abertura;
	dados +="\n Dia: " + this.dataDeAbertura.dia;
	dados +="\n Mes: " + this.dataDeAbertura.mes;
	dados +="\n Ano: " + this.dataDeAbertura.ano;
	dados += "\nData Formatada: " + this.dataDeAbertura.formatada();
return dados;
}







}

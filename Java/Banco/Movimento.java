/**/
class Movimento{
	public static void main (String[] args){

		Conta c = new Conta();

		c.titular="Hugo";
		c.numero=123;
		c.agencia="45678-9";
		c.saldo=50.0;
		c.abertura="04/06/2015";

		c.depositar(100.0);
		System.out.println("Saldo atula: "+c.saldo);
		System.out.println("Rendimento Mensal: "+c.calculaRendimento());

		System.out.println(c.recuperaDadosParaImpresao());

/************************************Exercicio 4*******************************************************************/

		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100;

		Conta c2 = new Conta();
		c2.titular = "Danilo";
		c2.saldo = 100;	


		if(c1==c2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}	

/******************************Exercicio 5**************************************************************************/

		Conta c3 = c2;
		c3.titular = "Danilo";
		c3.saldo = 100;

		if(c3==c2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}

/*****************************Exercicio 6 e 7*************************************************************************/

		Data data = new Data();
		c.dataDeAbertura = data;

		data.dia=5;
		data.mes=12;
		data.ano=2017;

		System.out.println(c.recuperaDadosParaImpresao2());


/*****************************Exercicio 9*************************************************************************/

		Data data1 = new Data();
		c.dataDeAbertura = data1;

		data1.dia=20;
		data1.mes=12;
		data1.ano=2017;

		System.out.println(c.recuperaDadosParaImpresao3());



	}

}

public class BalancoTrimestral{
	public static void main(String[] args){
	double gastoJan=15000;
	double gastoFev=23000;
	double gastoMar=17000;
	double gastoTrimestral = gastoJan + gastoFev + gastoMar;	
	double mediaMensal = (gastoJan + gastoFev + gastoMar)/3;	

		System.out.println("Gasto Trimestral: "+ gastoTrimestral + "\nMedia Mensal: " + mediaMensal);
	}
}




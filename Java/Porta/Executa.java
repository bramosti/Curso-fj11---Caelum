class Executa {
	public static void main (String[] args){
/***********************N 1******************************************************/
		Pessoa p1 = new Pessoa();
		
		p1.nome="Alex";
		p1.idade= 10;
		p1.fazAniversario(10);

/***********************N 2******************************************************/

		Porta p2 = new Porta();
		p2.cor = "Azul";
		p2.dimensaoX = 20 ;
		p2.dimensaoY = 10;
		p2.dimensaoZ = 5;


		p2.pintar("Verde");
		p2.abre();

	System.out.println(p2.imprimir());




















	}
}

/**/
class Porta{
	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;


void abre(){
	aberta = true;
}

void fecha(){
	aberta = false;
}

void pintar(String s){
	this.cor = s;
}

boolean estaAberta(){


return aberta;
}

String imprimir(){
	
return "\n A cor da porta è: "+this.cor +"\n A dimensaox da porta è: "+this.dimensaoX+ "\n Aporta esta "+this.aberta;

}








	


}
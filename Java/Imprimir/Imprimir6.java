/*Fibonaci*/
public class Imprimir6{
	public static void main(String[] args){
	int a = 0;
	int b = 1;
	int c = 0;
	
		System.out.println("Numero= "+ b);

		while(a<=100){
			a =b+c;
		System.out.println("Numero= " + a);
			c=b;		
			b=a;
		}

	}		
	
}





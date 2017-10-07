package br.com.caelum.contas.main;

import java.util.HashMap;

public class TesteMap {
/*
 * HashMap - Não mantem ordem de inserção a chave
 * LinkedHashMap - Mantem a ordem de inserção a chave
 * TreeMap - Ordena a chave
 * 
 * OBS: Todos os três herdam da Interface MAP
 * 
 * */
	public static void main(String[] args) {
		HashMap <String,Integer> sumario = new HashMap<>();
		
		sumario.put("Classes Abstratas", 125);
		sumario.put("Interfaces", 133);
		sumario.put("Exceções", 148);
		
		int pagina = sumario.get("Interfaces");
		System.out.println(pagina);
		
		System.out.println(sumario.get("Abobrinha"));
		
		

	}

}

package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
			c1.setTitular("Joao");
//			c1.setNumero(1234);
//			c1.setAgencia("111-2");
//			c1.depositar(100.0);
		Conta c2 = new ContaCorrente();
			c2.setTitular("Maria");
			
			if (c1.equals(c2)) {
				System.out.println("iguais");
			} else {
				System.out.println("diferentes");
			}
		
		
		//System.out.println(c1);
		
	}

}

package br.com.caelum.contas.modelo;

import javax.swing.JOptionPane;

public class TesteString {

	public static void main(String[] args) {
//		String s1 = "Batata";
//		String s2 = JOptionPane.showInputDialog("Digite:");
//		
//		if(s1.equalsIgnoreCase(s2)){  //iguinora o caixa auta ou caixa baixa
//			System.out.println("iguais");
//		}else {
//			System.out.println("diferentes");
//		}
		
//		String s3 = "batata";
//		String s4 =  s3.toUpperCase();//tudo maiusculo
//		s4 = s4.replace("T", "N");// trocar T por N
//		
//		System.out.println(s4);
		
		String s5 = JOptionPane.showInputDialog("Digite: ");
		boolean tem = s5.contains("amor");//se contem
		if (tem) {
			System.out.println("OK");
		} else {
			System.out.println("Eita");
		}
		System.out.println(s5.length());//numero de carcteres
		System.out.println(s5.isEmpty());//se está vazio
		System.out.println(s5.trim());//retira espaço das pontas
		
		
	}

}

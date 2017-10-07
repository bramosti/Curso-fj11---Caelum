package br.com.caelum.contas.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) throws Exception {

		//InputStream is = System.in;
		//InputStream is = new FileInputStream("saida.txt");
		InputStream is = new URL("http://www.caelum.com.br").openStream();
		Scanner sc = new Scanner(is);
		//OutputStream os = new FileOutputStream("saida2.txt");
		//PrintStream ps = new PrintStream(os);
		PrintStream ps = System.out;
		

		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			linha = linha.toUpperCase();
			ps.println(linha);
		}
		sc.close();
		ps.close();

	}

}

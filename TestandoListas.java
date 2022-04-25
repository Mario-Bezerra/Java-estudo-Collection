package br.com.mario.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		String nome1 = "Java.util";
		String nome2 = "IO java";
		String nome3 = "Getters and setters";
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		
		nomes.remove(nome1);
		
		System.out.println(nomes);
		System.out.println("O primeiro curso da lista é o "+ nomes.get(0));
		
		Collections.sort(nomes);
		
		for(int i=0 ; i<nomes.size() ; i++) {
			System.out.println(nomes.get(i));
		}
		
	}
}

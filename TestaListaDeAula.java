package br.com.mario.gerenciador.teste;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.mario.gerenciador.modelo.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(Aula::getTempoDeAula));
        
        System.out.println(aulas);
	}

}

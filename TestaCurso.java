package br.com.mario.gerenciador.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mario.gerenciador.modelo.Aula;
import br.com.mario.gerenciador.modelo.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
  
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        List<Aula> aulasimutaveis = javaColecoes.getAulas();
        ArrayList<Aula> aulas = new ArrayList<>(aulasimutaveis);
        
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
        
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
	}

}

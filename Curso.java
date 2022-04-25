package br.com.mario.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso (String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		 return this.aulas.stream().mapToInt(Aula::getTempoDeAula).sum();
	}
	
	@Override
	public String toString() {
		return " Curso: "+ this.nome + "\n Tempo total: " + this.getTempoTotal() + "\n Aulas: "+ this.aulas;
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		matriculaParaAluno.put(aluno.getNumerodamatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException();
		}
	    return this.matriculaParaAluno.get(numero);
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	
	
}

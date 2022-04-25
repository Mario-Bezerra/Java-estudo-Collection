package br.com.mario.gerenciador.modelo;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int numerodamatricula;
	
	public Aluno(String nome, int numerodamatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser vazio ");
		}
		this.nome = nome;
		this.numerodamatricula = numerodamatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumerodamatricula() {
		return numerodamatricula;
	}
	
	@Override
	public String toString() {
		return " Aluno: "+this.nome+" || Num da matricula: "+ this.numerodamatricula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numerodamatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numerodamatricula == other.numerodamatricula;
	}
	
	

}

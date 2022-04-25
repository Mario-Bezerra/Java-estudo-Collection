package br.com.mario.gerenciador.modelo;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempoDeAula;
	
	
	public Aula(String titulo, int tempo){
		this.titulo = titulo;
		this.tempoDeAula = tempo;
		}
	
	
	public String getTitulo() {
		return titulo;
	}



	public int getTempoDeAula() {
		return tempoDeAula;
	}


	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
	
	@Override
	public String toString() {
		return "Aula: "+ this.titulo + "; Tempo: " + this.tempoDeAula +" minutos"; 
	}
	
	

}

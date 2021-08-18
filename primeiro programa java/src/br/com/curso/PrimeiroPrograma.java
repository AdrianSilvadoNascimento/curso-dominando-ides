package br.com.curso;

import br.com.curso.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);

	}
}
class Livros {
	private String nome;
	private String autor;
}

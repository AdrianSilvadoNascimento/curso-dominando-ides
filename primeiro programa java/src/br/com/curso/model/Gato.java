package br.com.curso.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String raca;
	private Integer idade;
	
	
	public Gato(String nome, String raca, Integer idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public Gato() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, raca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(raca, other.raca);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
	}
	
	
}

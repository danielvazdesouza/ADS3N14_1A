package com.senac.apps;

public class Contato implements Comparable<Contato> {
	private String nome;
	private int telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public int compareTo(Contato c) {
		return nome.compareTo(c.getNome());
	}
}

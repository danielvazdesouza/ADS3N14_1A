package com.senac.apps;

public class Contato {

	private int id;
	private String nome;
	private int telefone;
	
	public Contato(int id, String nome, int telefone){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Contatos [id=" + id + ", nome=" + nome + ", telefone="
				+ telefone + "]";
	}
	
	
}

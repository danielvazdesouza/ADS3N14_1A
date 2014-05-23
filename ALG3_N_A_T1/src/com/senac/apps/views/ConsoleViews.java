package com.senac.apps.views;

import com.senac.estruturas.Contato;

public class ConsoleViews {
	public void exibirContato(Contato c){
		System.out.println("Nome: "+c.getNome()+" Telefone: "+c.getTelefone());
	}

}

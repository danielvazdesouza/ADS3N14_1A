package com.senac.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.senac.apps.views.ConsoleView;
import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;

public class Controller {
	
	private ListaOrdenada<Integer>
			lista = new ListaOrdenada<Integer>();
	private ConsoleView view = new ConsoleView();
	private Contatos contato[] = new Contatos[10];
	private int countContatos;
	
	public void iniciaLista() {
		for (int i = 0; i < 50; ++i) {
			Nodo<Integer> novo = new Nodo<Integer>();
			novo.setChave((int)(Math.random() * 10000));
			lista.insert(novo);
		}
	}
	
	public void imprimeLista() {
		Nodo<Integer> nodo = lista.getHead();
		while (nodo != null) {
			view.imprimeInteiro(nodo.getChave());
			nodo = nodo.getNext();
		}
	}
	
	public void lerAgenda() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader("agenda.txt")).useDelimiter("\\n");
		while(scanner.hasNext()){
			String contato = scanner.nextLine();
			System.out.println(contato);
		}
	}	
}










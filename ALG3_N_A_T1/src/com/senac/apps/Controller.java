package com.senac.apps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.senac.apps.views.ConsoleViews;
import com.senac.estruturas.Contato;
import com.senac.estruturas.ListaOrdenada;
import com.senac.estruturas.Nodo;

public class Controller<T extends Comparable<T>> {

	private ListaOrdenada<Contato> lista = new ListaOrdenada<Contato>();
	private ConsoleViews view = new ConsoleViews();
	Contato c = new Contato();
	private Scanner sc = new Scanner(System.in);
	private FileWriter fw;

	public void cadastrarContato() {

		System.out.println("Nome do contato: ");
		c.setNome(sc.next());
		System.out.println("Telefone: ");
		c.setTelefone(sc.nextInt());

		File file = new File("agenda.txt");
		try {
			fw = new FileWriter(file, true);
			fw.write(c.getNome() + " ");
			fw.write(c.getTelefone() + "\n");
			fw.flush();
		} catch (IOException e) {
			System.out.println("Erro ao escrever em arquivo " + e.getMessage());
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.out
						.println("Erro ao fechar arquivo.\n" + e.getMessage());
			}
		}
	}

	public void lerArquivo() {
		try {
			Scanner arquivo = new Scanner(new FileReader("agenda.txt"));
			while (arquivo.hasNext()) {
				Nodo<Contato> novo = new Nodo<Contato>();
				c.setNome(arquivo.next());
				c.setTelefone(arquivo.nextInt());
				novo.setChave(c);
				view.exibirContato(c);
				lista.insert(novo);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Falha ao ler arquivo.\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}

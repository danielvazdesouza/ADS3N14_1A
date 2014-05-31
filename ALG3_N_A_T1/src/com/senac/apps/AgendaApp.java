package com.senac.apps;

import java.util.Scanner;

public class AgendaApp {

	private Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		AgendaApp a = new AgendaApp();
		a.menu();
	}

	public void menu() {
		Controller c = new Controller();
		boolean k = true;
		do {
			System.out
					.println("\nDigite a opção que deseja executar ou qualquer outro número para sair:\n"
							+ "1 - Adicionar contato\n2 - Listar Contatos\n3 - Remover Contatos\n4 - Pesquisar Contato");

			switch (sc.nextInt()) {
			case 1:
				c.cadastrarContato();
				break;
				
			case 2:
				c.lerArquivo();
				break;
				
			case 4:
				System.out.println("Nome do contato: ");
				c.pesquisarContato(sc.next());

			default:
				k = false;
				break;
			}
		} while (k);
	}

}

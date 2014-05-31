package com.senac.apps.views;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.senac.apps.Contato;
import com.senac.apps.estruturas.Tree;

public class TreeApps {
	Tree<Contato> tree = new Tree<Contato>();


	public static void main(String[] args) {
		TreeApps ta = new TreeApps();
		ta.run();
	}
	
	public void run(){
		lerArquivo();
		System.out.println("\n\nPreorder traversal");
		tree.preorderTraversal();
		/*
		System.out.println("\n\nInorder traversal");
		tree.inorderTraversal();
		System.out.println("\n\nPostorder traversal");
		tree.postorderTraversal();
		System.out.println();
		*/
	}

	public void lerArquivo() {
		try {
			Scanner arquivo = new Scanner(new FileReader("agenda.txt"));
			while (arquivo.hasNext()) {
				Contato c = new Contato();
				c.setNome(arquivo.next());
				c.setTelefone(arquivo.nextInt());
				tree.insertNode(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Falha ao ler arquivo.\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}

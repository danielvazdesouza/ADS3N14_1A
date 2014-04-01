package com.senac.apps.views;

import java.util.Scanner;

import com.senac.apps.Matriz;

public class Principal {

	private final static int ROWS = 10;
	private final static int COLUMNS = 10;
	private static String[][] matrix = new String[ROWS][COLUMNS];
	private static String[] linhas = { "A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J" };
	private static int pontos = 15;

	Matriz m = new Matriz();
	Scanner sc = new Scanner(System.in);

	
	public static void criarMatriz() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				matrix[i][j] = ".";
			}
		}
	}

	public static void exibirMatriz() {

		for (int i = 0; i < COLUMNS; i++) {
			System.out.print("\t" + i);
		}

		System.out.println();

		for (int i = 0; i < ROWS; i++) {
			System.out.print(linhas[i]);
			for (int j = 0; j < COLUMNS; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}

	}
	
	
	public Matriz atirar(){
		System.out.println("Em qual a linha que você deseja atirar?");
		m.setLinha(converterLinha(sc.next()));
		
		System.out.println("Em qual a coluna que você deseja atirar?");
		m.setColuna(sc.nextInt());
		
		return m;
	}
	
	public static int converterLinha(String linhaEscolhida){
		int linha = 0;
		
		if(linhaEscolhida.equalsIgnoreCase("A")){
			linha = 0;
		} else if(linhaEscolhida.equalsIgnoreCase("B")){
			linha = 1;
		} else if(linhaEscolhida.equalsIgnoreCase("C")){
			linha = 2;
		} else if(linhaEscolhida.equalsIgnoreCase("D")){
			linha = 3;
		} else if(linhaEscolhida.equalsIgnoreCase("E")){
			linha = 4;
		} else if(linhaEscolhida.equalsIgnoreCase("F")){
			linha = 5;
		} else if(linhaEscolhida.equalsIgnoreCase("G")){
			linha = 6;
		} else if(linhaEscolhida.equalsIgnoreCase("H")){
			linha = 7;
		} else if(linhaEscolhida.equalsIgnoreCase("I")){
			linha = 8;
		} else {
			linha = 9;
		}
		
		return linha;
	}
	
	public void verificarAcerto(Matriz m){
		matrix[m.getLinha()][m.getColuna()] = "O";
		
		System.out.println(m.getLinha());
		System.out.println(m.getColuna());
	}
	
	public static boolean isWinner(){
		if(pontos == 0){
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		criarMatriz();
		exibirMatriz();
		do{
			//atirar();
			//verificarAcerto(m);
			exibirMatriz();
		} while (!isWinner());

		
	}

}

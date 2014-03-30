package com.senac.apps.views;

import java.util.Scanner;

public class Principal {

	private final static int ROWS = 10;
	private final static int COLUMNS = 10;
	private static String[][] matrix = new String[ROWS][COLUMNS];
	private static String[] linhas = { "A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J" };
	private int pontos = 15;
	
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
	
	public String getLinha(){
		System.out.println("Em qual a linha que você deseja atirar?");
		return sc.next();
	}
	
	public int getColuna(){
		System.out.println("Em qual a coluna que você deseja atirar?");
		return sc.nextInt();
	}
	
	public int converterLinha(){
		int linha = 0;
		
		if(getLinha().equalsIgnoreCase("A")){
			linha = 0;
		} else if(getLinha().equalsIgnoreCase("B")){
			linha = 1;
		} else if(getLinha().equalsIgnoreCase("C")){
			linha = 2;
		} else if(getLinha().equalsIgnoreCase("D")){
			linha = 3;
		} else if(getLinha().equalsIgnoreCase("E")){
			linha = 4;
		} else if(getLinha().equalsIgnoreCase("F")){
			linha = 5;
		} else if(getLinha().equalsIgnoreCase("G")){
			linha = 6;
		} else if(getLinha().equalsIgnoreCase("H")){
			linha = 7;
		} else if(getLinha().equalsIgnoreCase("I")){
			linha = 8;
		} else {
			linha = 9;
		}
		
		return linha;
	}
	
	public void tiro(){
		matrix[converterLinha()][getColuna()] = "O";
	}

	public static void main(String[] args) {
		criarMatriz();
		exibirMatriz();
	}
}

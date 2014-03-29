package com.senac.apps.views;

public class Principal {

	private final static int ROWS = 10;
	private final static int COLUMNS = 10;
	private static String[][] matrix = new String[ROWS][COLUMNS]; 
	private static String [] linhas = {"A","B","C","D","E","F","G","H","I","J"};
	
	public Principal(){
		
	}
	
	public static void criarMatriz(){
		for(int i =0; i < ROWS; i++){
			for(int j = 0; j < COLUMNS; j++){
				matrix[i][j] = ".";
			}
		}
	}
	
	public static void exibirMatriz(){
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");

		for(int i =0; i < ROWS; i++){
			System.out.print(linhas[i]);
			for(int j = 0; j < COLUMNS; j++){
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args){
		criarMatriz();
		exibirMatriz();
	}
}

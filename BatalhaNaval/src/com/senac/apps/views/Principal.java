package com.senac.apps.views;

import java.util.Random;
import java.util.Scanner;

import com.senac.apps.Matriz;

public class Principal {

	private final static int ROWS = 10;
	private final static int COLUMNS = 10;
	private static String[][] matrix = new String[ROWS][COLUMNS];
	private static String[][] matrixOculta = new String[ROWS][COLUMNS];
	private static String[] linhas = { "A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J" };
	private int pontos = 15;
	private int l, c;

	Matriz m = new Matriz();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public void criarMatriz() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				matrix[i][j] = ".";
				matrixOculta[i][j] = ".";
			}
		}
	}

	public int sortearLinha() {
		return r.nextInt(ROWS);
	}

	public int sortearColuna() {
		return r.nextInt(COLUMNS);
	}

	public void exibirMatriz() {
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

	public void exibirMatrizOculta() {
		for (int i = 0; i < COLUMNS; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		for (int i = 0; i < ROWS; i++) {
			System.out.print(linhas[i]);
			for (int j = 0; j < COLUMNS; j++) {
				System.out.print("\t" + matrixOculta[i][j]);
			}
			System.out.println();
		}
	}

	public Matriz atirar() {
		System.out.println("Em qual a linha que você deseja atirar? [A - J]");
		m.setLinha(converterLinha(sc.next()));
		System.out.println("Em qual a coluna que você deseja atirar?");
		m.setColuna(sc.nextInt());
		return m;
	}

	public int converterLinha(String linhaEscolhida) {
		int linha;
		if (linhaEscolhida.equalsIgnoreCase("A")) {
			linha = 0;
		} else if (linhaEscolhida.equalsIgnoreCase("B")) {
			linha = 1;
		} else if (linhaEscolhida.equalsIgnoreCase("C")) {
			linha = 2;
		} else if (linhaEscolhida.equalsIgnoreCase("D")) {
			linha = 3;
		} else if (linhaEscolhida.equalsIgnoreCase("E")) {
			linha = 4;
		} else if (linhaEscolhida.equalsIgnoreCase("F")) {
			linha = 5;
		} else if (linhaEscolhida.equalsIgnoreCase("G")) {
			linha = 6;
		} else if (linhaEscolhida.equalsIgnoreCase("H")) {
			linha = 7;
		} else if (linhaEscolhida.equalsIgnoreCase("I")) {
			linha = 8;
		} else {
			linha = 9;
		}
		return linha;
	}

	public void verificarAcerto(Matriz m) {
		if (matrixOculta[m.getLinha()][m.getColuna()] != ".") {
			matrix[m.getLinha()][m.getColuna()] = "O";
			pontos += 3;
		} else {
			matrix[m.getLinha()][m.getColuna()] = "-";
			pontos -= 1;
		}
		System.out.println("Pontuação: " + pontos);
	}

	public void jogar() {
		criarMatriz();
		criarNavios();
		do {
			exibirMatriz();
			atirar();
			verificarAcerto(m);
		} while (isWinner());

	}

	public static void main(String[] args) {
		Principal p = new Principal();
		p.jogar();
	}

	public void criarNavios() {
		criarSubmarinos();
		criarTorpedeiros();
		criarFragata();
		criarDestroyer();
		criarPortaAvioes();
	}

	public void criarSubmarinos() {
		for (int i = 0; i < 5; i++) {
			boolean k = true;
			do {
				l = sortearLinha();
				c = sortearColuna();

				if (verificaMatrix(l, c, 1)) {
					matrixOculta[l][c] = "S";
					k = false;
				} else {
					l = sortearLinha();
					c = sortearColuna();
				}
			} while (k);
		}
	}

	public void criarTorpedeiros() {
		for (int i = 0; i < 3; i++) {
			boolean k = true;
			do {
				l = sortearLinha();
				c = sortearColuna();

				if (verificaMatrix(l, c, 2)) {
					matrixOculta[l][c] = "T";
					matrixOculta[l][c + 1] = "T";
					k = false;
				} else {
					l = sortearLinha();
					l = sortearColuna();
				}
			} while (k);
		}
	}

	public void criarFragata() {
		for (int i = 0; i < 2; i++) {
			boolean k = true;
			do {
				l = sortearLinha();
				c = sortearColuna();

				if (verificaMatrix(l, c, 3)) {
					matrixOculta[l][c] = "F";
					matrixOculta[l][c + 1] = "F";
					matrixOculta[l][c + 2] = "F";
					k = false;
				} else {
					l = sortearLinha();
					l = sortearColuna();
				}
			} while (k);
		}
	}

	public void criarDestroyer() {
		for (int i = 0; i < 2; i++) {
			boolean k = true;
			do {
				l = sortearLinha();
				c = sortearColuna();

				if (verificaMatrix(l, c, 4)) {
					matrixOculta[l][c] = "D";
					matrixOculta[l][c + 1] = "D";
					matrixOculta[l][c + 2] = "D";
					matrixOculta[l][c + 3] = "D";
					k = false;
				} else {
					l = sortearLinha();
					l = sortearColuna();
				}
			} while (k);
		}
	}

	public void criarPortaAvioes() {
		boolean k = true;
		do {
			l = sortearLinha();
			c = sortearColuna();

			if (verificaMatrix(l, c, 5)) {
				matrixOculta[l][c] = "P";
				matrixOculta[l][c + 1] = "P";
				matrixOculta[l][c + 2] = "P";
				matrixOculta[l][c + 3] = "P";
				matrixOculta[l][c + 4] = "P";
				k = false;
			} else {
				l = sortearLinha();
				l = sortearColuna();
			}
		} while (k);
	}

	public boolean verificarTamanho(int coluna, int tamanho) {
		if (coluna > COLUMNS - tamanho) {
			return false;
		} else {
			return true;
		}
	}

	public boolean verificarVazio(int linha, int coluna, int tamanho) {
		for (int i = coluna; i < coluna + tamanho; i++) {
			if (matrixOculta[linha][i] != ".") {
				return false;
			}
		}
		return true;
	}

	public boolean verificaMatrix(int linha, int coluna, int tamanho) {
		if (verificarTamanho(coluna, tamanho)) {
			if (verificarVazio(linha, coluna, tamanho)) {
				return true;
			}
		}
		return false;
	}

	public boolean isWinner() {
		if (pontos > 0) {
			return true;
		} else {
			return false;
		}

	}
}
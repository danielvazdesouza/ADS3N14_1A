import java.util.Scanner;

public class Sort {
	private int listSS[];
	private int listHS[];
	private int comparacoesSS = 0;
	private int comparacoesHS = 0;
	Scanner sc = new Scanner(System.in);

	public void adicionarLista(int qtd) {
		listSS = new int[qtd];
		for (int i = 0; i < listSS.length; i++) {
			System.out.println("Digite um número para adicionar a lista");
			listSS[i] = sc.nextInt();
		}
		listHS = listSS;
	}

	public void ordenarSelectionSort() {
		for (int i = 0; i < listSS.length; i++) {
			for (int j = i + 1; j < listSS.length; j++) {
				if (listSS[i] > listSS[j]) {
					int a = listSS[i];
					listSS[i] = listSS[j];
					listSS[j] = a;
					comparacoesSS = comparacoesSS + 1;
				}
			}
		}
	}

	public void OrdenarHeapSort() {
		int[] v = listHS;
		buildMaxHeap(v);
		int n = v.length;

		for (int i = v.length - 1; i > 0; i--) {
			swap(v, i, 0);
			maxHeapify(v, 0, --n);
		}
	}

	private void buildMaxHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--) {
			maxHeapify(v, i, v.length);
		}
	}

	private void maxHeapify(int[] v, int pos, int n) {
		comparacoesHS += 1;
		int max;
		int l = 2 * pos + 1;
		int right = 2 * pos + 2;
		if ((l < n) && (v[l] > v[pos])) {
			max = l;
		} else {
			max = pos;
		}
		if (right < n && v[right] > v[max]) {
			max = right;
		}
		if (max != pos) {
			swap(v, pos, max);
			maxHeapify(v, max, n);
		}
	}

	public void swap(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}

	public void listar() {
		System.out.println("Lista ordenada em " + comparacoesSS
				+ " comparações - SelectionSort");
		for (int i = 0; i < listSS.length; i++) {
			System.out.print(listSS[i] + " ");
		}
		System.out.println("\nLista ordenada em " + comparacoesHS + " comparações - HeapSort");
		for (int i = 0; i < listHS.length; i++) {
			System.out.print(listHS[i] + " ");
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
	ArrayList<Integer> lista = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);

	public void adicionarLista() {
		System.out
				.println("Digite um número para adicionar a lista");
		lista.add(sc.nextInt());

	}

	public void ordenarSelectionSort() {

		for (int i = 0; i < lista.size(); i++) {

			for (int j = i + 1; j < lista.size(); j++) {

				if (lista.get(i) > lista.get(j)) {
					int a = lista.get(i);
					lista.set(i, lista.get(j));
					lista.set(j, a);
				}

			}
		}

	}

	public void listar() {
		System.out.println("Lista ordenada");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
	}
	
	public void ordenarHeapSort(){
		
	}

}

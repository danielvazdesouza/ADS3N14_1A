import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Sort s = new Sort();
		System.out.println("Quantos n�meros deseja adicionar a lista?");
		s.adicionarLista(sc.nextInt());
		s.ordenarSelectionSort();
		s.OrdenarHeapSort();
		s.listar();
	}
}

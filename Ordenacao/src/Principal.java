import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Sort s = new Sort();
		System.out.println("Quantos números deseja adicionar a lista?");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			s.adicionarLista();
		}

		s.ordenarSelectionSort();
		s.listar();

	}

}

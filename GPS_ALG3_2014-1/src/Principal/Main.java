package Principal;

import Controller.Leitora;
import Model.Grafo;

public class Main {
	public static void main(String[] args) {		
		Leitora l = new Leitora();
		
		Grafo grafo = l.populaGrafo();
	}
}

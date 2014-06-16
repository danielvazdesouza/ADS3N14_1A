package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.*;

public class Leitora {

	private Scanner scanner;
	private List<Vertice> vertices;
	private List<Aresta> aresta;
	private Grafo grafo;

	public Leitora() {
		try {
			scanner = new Scanner(new FileReader("grafo.txt"));
			scanner.useLocale(Locale.US);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		vertices = new ArrayList<Vertice>();
		aresta = new ArrayList<Aresta>();
		grafo = new Grafo();
	}

	public Grafo populaGrafo() {
		if (scanner.next().equals("vertices")) {
			populaVertices();
		}

		if (scanner.next().equals("arestas")) {
			populaArestas();
		}
		
		this.grafo.setVertices(vertices);
		
		return this.grafo;
	}

	public void populaVertices() {
		while (scanner.hasNext()) {
			if (!scanner.hasNext("arestas")) {
				Vertice novoVertice = new Vertice();
				novoVertice.setIndex(scanner.nextInt());
				novoVertice.setPosX(scanner.nextDouble());
				novoVertice.setPosY(scanner.nextDouble());

				vertices.add(novoVertice);

			} else {
				break;
			}
		}
	}

	public void populaArestas() {
		while (scanner.hasNext()) {
			Aresta novaAresta = new Aresta();
			/*
			 * Aqui estamos fazendo com que o NextInt pegue corretamente o
			 * vertice A. Teoricamente, quando populada a lista de vértice,
			 * inserimos na mesma ordem que o indice do arraylist de vertices
			 */
			novaAresta.setA(vertices.get(scanner.nextInt()));
			// Dá problema se editar o arquivo
			novaAresta.setB(vertices.get(scanner.nextInt()));
			novaAresta.setCusto(scanner.nextDouble());
			novaAresta.setNome("Aresta entre vertice "
					+ novaAresta.getA().getIndex() + " e o vertice "
					+ novaAresta.getB().getIndex());

			// calculo da distancia entre dois pontos cartesianos
			double quadradoX = (novaAresta.getA().getPosX() - novaAresta.getB().getPosX()) * (novaAresta.getA().getPosX() - novaAresta.getB().getPosX());
			double quadradoY = (novaAresta.getA().getPosY() - novaAresta.getB().getPosY()) * (novaAresta.getA().getPosY() - novaAresta.getB().getPosY());

			double distancia = Math.sqrt(quadradoX + quadradoY);

			novaAresta.setDistancia(distancia);
			aresta.add(novaAresta);
			
			for (int i = 0; i < vertices.size(); i++) {
				if (vertices.toArray()[i] == novaAresta.getA() || vertices.toArray()[i] == novaAresta.getB()){
					Vertice verticeTemp = (Vertice) vertices.toArray()[i];
					verticeTemp.adicionaArestaDeConexao(novaAresta);
				}
			}
		}
	}
}

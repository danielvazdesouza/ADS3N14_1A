package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Model.*;

public class Dijkstra {
	
	List<Vertice> pilhaDeVertices;    
	List<Vertice> listaVisitados;
	List<Aresta> listaMenorCaminho;
	Vertice raiz;
    Vertice atual;
	
    
	public Dijkstra(){
		this.pilhaDeVertices = new Stack<Vertice>();
		this.listaMenorCaminho = new ArrayList<Aresta>();
	}
	
	public ArrayList<Aresta> custoMinimo(Vertice raizDaBusca, Grafo grafo){
		
		//Aplicar lógica para o algoritmo de Dijkstra		
		return null;
	}

}

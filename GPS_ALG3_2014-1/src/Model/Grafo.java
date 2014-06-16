package Model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> vertices;
    private List<Aresta> arestas;
    
    public Grafo(){
    	 vertices = new ArrayList<Vertice>();
    	 arestas = new ArrayList<Aresta>();
    }

	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

}

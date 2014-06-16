package Model;

public class Aresta {
	
	private String nome;	
	private Vertice A;	
	private Vertice B;
	private double custo;
	private double distancia;
	
	public Aresta(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Vertice getA() {
		return A;
	}

	public void setA(Vertice a) {
		A = a;
	}

	public Vertice getB() {
		return B;
	}

	public void setB(Vertice b) {
		B = b;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	
}

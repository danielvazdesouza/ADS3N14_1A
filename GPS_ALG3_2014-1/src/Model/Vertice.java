package Model;

import java.util.ArrayList;

public class Vertice {
	
	private int index;
	private double posX;
	private double posY;
	private ArrayList<Aresta> arestasDeConexao;
	
	public Vertice(){
		this.arestasDeConexao = new ArrayList<Aresta>();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public ArrayList<Aresta> getArestasDeConexao() {
		return arestasDeConexao;
	}

	public void adicionaArestaDeConexao(Aresta novaAresta) {
		this.arestasDeConexao.add(novaAresta);
	}	
}

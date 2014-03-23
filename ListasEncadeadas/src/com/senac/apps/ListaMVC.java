package com.senac.apps;

import java.io.FileNotFoundException;


public class ListaMVC {


	
	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.iniciaLista();
		//controller.imprimeLista();
		try {
			controller.lerAgenda();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}

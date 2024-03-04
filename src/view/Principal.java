package view;

import controller.DigitoController;

public class Principal {
	
	public static void main(String[] args) {
		
		DigitoController dg = new DigitoController(); 
		
		int n = 345127;
		int aux = 10;
		
		int resultado = dg.FuncaoDG(n, aux);
		System.out.println("Quantidade de digitos: "+ resultado);
		
	}

}

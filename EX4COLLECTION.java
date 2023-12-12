package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EX4COLLECTION {

	public static void main(String[] args) {
		
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 Scanner leia = new Scanner (System.in);
	        int lugar, numeroEncontrado;
	        
		        numeros.add(2);
		        numeros.add(5);
		        numeros.add(1);
		        numeros.add(3);
		        numeros.add(4);
		        numeros.add(9);
		        numeros.add(7);
		        numeros.add(8);
		        numeros.add(10);
		        numeros.add(6);
		        
		        
		 for ( int posicao:numeros) {
			 System.out.println(posicao);
			 
		 }
		 System.out.println("\nDigite o numero que deseja encontrar: ");
	 numeroEncontrado = leia.nextInt();
	lugar =numeros.indexOf( numeroEncontrado);
		        
	if (lugar>=0) {
		System.out.println("\nO numero " +numeroEncontrado +" foi encontrado" );
	}else {
		System.out.println("\nO numero "+ numeroEncontrado + " não foi encontrado");
	}
	
		
	}
}

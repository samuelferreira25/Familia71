package Vetores;

import java.util.Scanner;

public class EX1VETOR {

	public static void main(String[] args) {
		int numero[] = new int [10];
		Scanner leia= new Scanner (System.in);
		int x, posicao=0, num;
				String local;
		boolean encontrado = false;
		
		for (x=0; x<10; x++) {
	System.out.println("\nEntre com um numero: ");
	numero[x]=leia.nextInt();
	
		     
		} 
		System.out.println("\nQual numero deseja encontrar: ");
		num=leia.nextInt();
		
		for (x=0; x<10; x++) {
			if (numero[x]==num) {
				encontrado = true;
				posicao = x;
			}
		
		}
	if (encontrado) {
		System.out.println("\nO numero foi encontrado na posicao: " + posicao);
		 
	}else {
		System.out.println("\nO numero não foi encontrado. ");
	}

	}

}

package Vetores;

import java.util.Scanner;

public class EX3MATRIZ {

	public static void main(String[] args) {
		int numeros [][] = new int [3][3];
		 int linha, coluna;
		 String DiagP = "";
		 Scanner leia = new Scanner(System.in);
		 
		 for ( linha = 0;linha < 3; linha++ ) {
			 
		 for (coluna = 0 ; coluna <3; coluna ++) {
			
			 System.out.println("\nEntre com um numero: ");
			 numeros [linha][coluna]=leia.nextInt();
			     
			 
		}
		 
		 } 	
	
System.out.println("\n elementos da diagonal principal \n" + numeros [0][0] +" " + numeros[1][1] + " "+ numeros[2][2] +" ");
System.out.println("\n elementos da diagonal secundaria \n" + numeros [0][2]+ " " + numeros [0][1] + " "+ numeros [2][0]+ " ");
System.out.println("\n soma da diagonal principal \n"+ (numeros [0][0] + numeros[1][1] + numeros[2][2]));
System.out.println("\n elementos da diagonal secundaria \n" + ( numeros [0][2] + numeros [1][1] + numeros [2][0]));
	             
	
	
	
	
	}	 
		 
	}



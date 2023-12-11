package Vetores;

import java.util.Scanner;

public class EX2VETOR {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	   int soma = 0 , numImpar=0, numPar=0,x;
	   float media=0;
	   int numero[]= new int [10];
	   
	   
	   for (x=0; x<10; x++) {
		   
		   System.out.println("\nEntre com um valor: ");
		   numero[x]=leia.nextInt();
		   soma+= numero[x] ;
		   media = soma/10;
	  if (numero[x]%2==0) {
		   numPar++;
		  
		   } else {
			   numImpar++;
			  
	         
		   
	}
	}   System.out.println("\nO valor da média é: "+ media);
	   System.out.println("\nO valor da soma é: "+soma);
	   System.out.println("\nA quantidade de numero impar é: " + numImpar++);
	System.out.println("\nA quantidade de numero par é: "+ numPar++);
	        

	     }
	}
	


	

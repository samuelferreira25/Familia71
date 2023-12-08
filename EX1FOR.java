package Laçosderepetição;

import java.util.Scanner;

public class EX1FOR {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		  int TotalPares=0, TotalImpares=0, contador, numero;
		
		     
		  for (contador = 1; contador <=10; contador++ ) {
			  
			  System.out.println("\nEntre com o " + contador +"º numero: ");
			  numero=leia.nextInt();
			  
		  if (numero %2==0){
			  TotalPares++;
		  } else {
		
		          TotalImpares++;
		    
}
	}
		  System.out.println("\ntotal de numeros pares: "+ TotalPares);
          System.out.println("\ntotal de numeros impares: "+ TotalImpares);

	}
}



	
	



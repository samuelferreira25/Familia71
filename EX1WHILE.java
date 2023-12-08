package Laçosderepetição;

import java.util.Scanner;

public class EX1WHILE {

	public static void main(String[] args) {
		int idade, total, menorde21=0, maiorde50=0;
		
		Scanner leia = new Scanner (System.in);
	           while(true){
				  System.out.println("\nEntre com sua idade: ");
					idade=leia.nextInt();
					
					if (idade<0) {
						break;
					}
					if (idade<21) {
						menorde21++;
		}else if( idade>50) {
		maiorde50++;	
	}
	System.out.println("\nO numero de maior que 50 anos é de: " +maiorde50  );
	System.out.println("\nA quantidade de pessoas menores de 21 anos é: "+menorde21);	

	}
			  }
}
			  
	
		
	

			  
	


	



	
	
	




	
	
	
	



package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX1ARRAY {

	public static void main(String[] args) {
		ArrayList<String> minhaLista = new ArrayList<String>();
		
	Scanner leia = new Scanner (System.in);
	

	for (int i= 0; i<5; i++) {
		System.out.println("\nDigite uma cor: ");	
		minhaLista.add(leia.nextLine());
	      //RODAR 5 VEZES A QUANTIDADE PARA DIGITAR A COR
	
	}
	
	   System.out.println("\nLista das cores:");
	   for(String cor: minhaLista) {
		   System.out.println(cor);
		   //VAI LER TUDO QUE ESTA NA minhaLista
	   }
	   minhaLista.sort(null);
	   System.out.println("\nCores ordenadas: ");
	   for(String cor: minhaLista) {
		   System.out.println(cor);
	   
	     // vai ordenar na ordem alfabética
	   }
	    
	        
	        
	}

}

package JavaNaVeia;

import java.util.Scanner;

public class LaçosdeRepetição {

	public static void main(String[] args) {
         
      float A, B, C;
      Scanner ler = new Scanner(System.in);
      
      System.out.println("\nEntre com o valor de A: ");
      A = ler.nextFloat();
      System.out.println("\nEntre com o valor de B: ");
      B= ler.nextFloat();
      System.out.println("\nEntre com o valor de C:");
      C=ler.nextFloat();
       
        if((A+B)>C) { 
    	  System.out.println("\nO valor da soma é maior que C");
    		  
    	  }else if(A+B==C) {
    		  System.out.println("\nO valor é igual a C");
    	  }else {
    		  System.out.println("\nO valor é menor que C");
    	  
    	  
      }
}
      	
    
}   
      
      
      

	


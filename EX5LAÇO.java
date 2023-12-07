package JavaNaVeia;

import java.util.Scanner;



public class EX5LAÇO {

	public static void main(String[] args) {
		
			int cod, quant;
			double Total;
       Scanner ler= new Scanner(System.in);
       
       
   
         ;
              System.out.println("\n1-Cachorro quente -- R$10,00 ");
              System.out.println("\n2-X salada -- R$15,00 ");
              System.out.println("n3-X Bacon -- R$18,00");
              System.out.println("\n4-Bauru -- R$ 12,oo");
              System.out.println("\n5-Refrigerante -- R$8,00");
              System.out.println("\n6-Suco de laranja -- R$13,00");
              System.out.println("\nDigite sua opção: ");
             cod=ler.nextInt();
             System.out.println("\nDigite a quantidade: ");
              quant=ler.nextInt();
             
             
             switch (cod) {
             case 1:
 
            	 Total = 10 * quant;
            	 System.out.println("\nCachorro quente: "+Total);
            	
            	 break;
             case 2:
            	 Total = 15 * quant;
            	 System.out.println("\nX SALADA: "+Total);
                  
             break;
             case 3:
            	 Total = 18 * quant;
            	 System.err.println("\nX bacon: "+Total);
        
             break;
             
             case 4:
            	 Total = 12 * quant;
            	 System.out.println("\nBauru: "+Total);             
           
              break;
              
             case 5: 
            	 Total = 8 * quant;
            	 System.out.println("\nRefrigerante: "+Total);
            	 break;
             case 6:
            	 Total = 13 * quant;
             System.out.println("\nSuco de laranja: "+Total);
             
             
             
             }
             
              
    
	
	
	
	}
	

}

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EX2ARRAY {

	public static void main(String[] args) {
		
          ArrayList <Integer> Lista = new ArrayList <Integer>();
          
          Scanner leia = new Scanner(System.in);
          int posicao, numeroEncontrado;
        
         
          
            	 for (int i=0; i<10; i++) {
           System.out.println("\nDigite um numero: ");
           Lista.add(leia.nextInt());
           //Adicionar valores na Lista
            
       }
            	 System.out.println("\nLista de numeros: ");
            	 for (int lista:Lista) {
            		 System.out.println(lista);
            		 //Percorre toda a lista de numeros
            	 }
          System.out.println("\nDigite o numero que deseja encontrar: ");
                 numeroEncontrado = leia.nextInt();
                 posicao = Lista.indexOf(numeroEncontrado);
                 // metodo para procurar o numero que o usuario digitou.
                 
                 if (posicao>=0) {
                	 System.out.println("\nO numero "+numeroEncontrado+ "esta na posicao "+posicao );
                 }else {
                	 System.out.println("\nO numero"+numeroEncontrado + "não foi encontrado");
                	 
                 }
          
	}
	}




          
               
          
        		 
	



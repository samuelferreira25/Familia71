package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EXFILA {

	public static void main(String[] args) {
		
		 Queue<String> agenda = new LinkedList<String>();
		 		Scanner leia = new Scanner (System.in);
		 		int op;
		 		
		 		
		 		do {
		 			System.out.println("--------------------");
		 			System.out.println("\n(1) Adicionar clientes na Lista: ");
		 			System.out.println("\n(2) Lista de todos os clientes: ");
		 			System.out.println("\n(3) Retirar cliente da fila: ");
		 			System.out.println("\n(0) Sair");
		 			System.out.println("-----------------");
		 			System.out.println("\n Digite uma opção: ");
		 			op = leia.nextInt();
		 			
		 			
		 			switch (op) {
		 			case 1:
		 				leia.nextLine();
		 				System.out.println("\nDigite um nome: ");
		 				agenda.add(leia.nextLine());
		 				break;
		 				
		 			case 2:
		 				leia.nextLine();
		 				 System.out.println("\nPessoas agendadas: ");
		 				  System.out.println(agenda);
		 				  break;
		 				  
		 			case 3:
		 				leia.nextLine();
		 				System.out.println("\nO nome:  "+ agenda.remove()+" foi atendido com sucesso!" );
		 				break;
		 				
		 			
		 				
		 				default:
		 					System.out.println("\nMuito obrigado por usar nosso sistema!! ");
				 			
		 					break;
		 				  
		 			}	 
		 			
		 		
		 		}while(op!=0);
		 		
		 		leia.close();
		 			
		 			 		
	}
}

		 			
		 		

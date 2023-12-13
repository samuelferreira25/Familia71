package collection;

import java.util.Scanner;
import java.util.Stack;

public class EXPILHA {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack <String>();
		Scanner leia = new Scanner (System.in);
		 int op;
		    do {
		    	System.out.println("\n(1) Adicionar livro a pilha: ");
		    	System.out.println("\n(2) Lista de todos os livros: ");
		    	System.out.println("\n(3) Remover livro da pilha: ");
		    	System.out.println("\n(0) Sair: ");
		    	System.out.println("\n-------------------");
		    	System.out.println("\n Escolha uma opção:  ");
		    	op=leia.nextInt();
		    	
		    switch (op) {
		    case 1:
		    	leia.nextLine();
		    	System.out.println("\n Digite o nome do livro: ");
		    	pilha.push(leia.nextLine());
		    	break;
		    case 2:
		    	leia.nextLine();
		    	System.out.println(pilha);
		    	break;
		    case 3:
		    	System.out.println("\nO livro "+ pilha.pop()+ " foi removido da pilha");
		    	break;
		    	default:
		    		System.out.println("\nObrigado por usar nosso sistema!! ");
		    		break;
		    		
		    	}
		    	
		    } while (op!=0);
	}

}

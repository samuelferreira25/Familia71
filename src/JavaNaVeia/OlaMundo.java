package JavaNaVeia;


		import java.util.Scanner;

	
	public class OlaMundo{
		public static void main (String[] args){
				
				Scanner leia = new Scanner(System.in);
				
				final int numero = 3;//criação de uma constante em java
				String nome="Lauane Gonçalves";
				int idade = 28;
				float altura = (float) 1.60;
				
				System.out.println("Meu nome é: "+nome);
				System.out.println("\n\tEu tenho: "+idade+" ano(s) de vida...");
				System.out.println("\n\tEu tenho: "+altura+" metro(s) de altura...");
				
				System.out.println("\nEntre com o seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nEntre com a sua idade: ");
				idade = leia.nextInt();
				System.out.println("\nEntre com a sua altura: ");
				altura = leia.nextFloat();
				
				System.out.println("Meu nome é: "+nome);
				System.out.println("\n\tEu tenho: "+idade+" ano(s) de vida...");
				System.out.println("\n\tEu tenho: "+altura+" metro(s) de altura...");

				leia.close();
			}


	}



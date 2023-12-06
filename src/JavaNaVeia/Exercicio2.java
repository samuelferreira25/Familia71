package JavaNaVeia;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double  	 Nota1 ,Nota2, Nota3, Nota4, Media;
		
		Scanner leia = new Scanner (System.in);
		  
		System.out.println ("\nDigite a Nota1: ");
		Nota1 = leia.nextDouble();
		System.out.println ("\nDigite a Nota2: ");
		Nota2 = leia.nextDouble();
		System.out.println ("\nDigite a Nota3: ");
		Nota3 = leia.nextDouble();
		System.out.println ("\nDigtie a Nota4: ");
		Nota4 = leia.nextDouble();
		Media = (Nota1 + Nota2 + Nota3 + Nota4) /4;
		System.out.println("\nA Media de notas é: " + Media);
        
	}

}

	package JavaNaVeia;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double n1, n2,n3,n4, Diferença; 
		Scanner leia = new Scanner (System.in);
		System.out.println ("\nDigite o valor de n1: ");
		n1 = leia.nextDouble();
			System.out.println ("\nDigite o valor de n2: ");
			n2 = leia.nextDouble();
			System.out.println ("\nDigite o valor de n3: ");
			n3 = leia.nextDouble();
			System.out.println ("\nDigite o valor de n4: ");
			n4 = leia.nextDouble();
			Diferença = (n1 * n2) - (n3 * n4);
			System.out.println ("\nA diferença é: " + Diferença);
			

	}

}

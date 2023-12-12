package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EX3COLLECTION {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashSet<Integer> Numeros = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite um numero: ");
			Numeros.add(leia.nextInt());

		}
		Iterator<Integer> It = Numeros.iterator();
		while (It.hasNext()) {
			System.out.println(It.next());

		}
		/*
		 * It = Numeros.iterator(); while (It.hasNext()) {
		 * System.out.println(It.next());
		 * 
		 * 
		 * }
		 */
	}

}

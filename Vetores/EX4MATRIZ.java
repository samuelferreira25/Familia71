package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class EX4MATRIZ {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float[][] notas = new float [10][4];
		int participante, nota;
		float media [] = new float [10];
	      String nome;
		
		for (participante=0;participante <10; participante++) {
			media[participante]=0;
			
		for (nota=0; nota<4 ; nota++) {
			
			System.out.println("\nDigite a nota "+(nota+1));
			notas[participante][nota]=leia.nextFloat();
			media [participante]+=notas[participante][nota];
			}  
		media[participante]/=4;
		
		   }
		System.out.println("\nA media é: "+ Arrays.toString(media));
		
		

	}

}

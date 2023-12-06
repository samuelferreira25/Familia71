package JavaNaVeia;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		double SalarioBruto, AdicionalNoturno, HorasExtras, Descontos, SalarioLiquido;
		Scanner leia = new Scanner(System.in);
		System.out.println ("\nDigite o salario bruto: ");
		SalarioBruto = leia.nextDouble();
		System.out.println ("\nDigite o adicional noturno: ");
		AdicionalNoturno = leia.nextDouble();
		System.out.println ("\nDigite as Horas Extras: ");
		HorasExtras = leia.nextDouble();
		System.out.println ("\nDigite os Descontos: ");
		Descontos = leia.nextDouble();
		SalarioLiquido = (SalarioBruto + AdicionalNoturno) + HorasExtras*5 - Descontos;
		System.out.println ("\nO valor do salario liquido é de: " + SalarioLiquido);
		
				 
	}

}

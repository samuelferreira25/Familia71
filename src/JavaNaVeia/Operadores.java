package JavaNaVeia;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
         double  Salario, abono, novoSalario;
				
		System.out.println ("Digite o valor do Salario: ");
		Salario = leia.nextInt();
		System.out.println ("Digite o valor do Abono: ");
		abono = leia.nextInt();
		novoSalario = Salario + abono;
		System.out.println ("O novo salario é de: " + novoSalario );
		
				
		
				
		
		
		
		
		
		

	}

}

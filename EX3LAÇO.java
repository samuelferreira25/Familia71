package JavaNaVeia;

import java.util.Scanner;

public class EX3LAÇO {

	public static void main(String[] args) {
		
	String Doador;
	int idade;
	Boolean first;
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("\nQual o seu nome? ");
	 Doador=ler.nextLine();
	 System.out.println("\nQual sua idade? ");
	 idade=ler.nextInt();
	 System.out.println("\nÉ a primeira vez doando sangue? (true/false)");
	first = ler.nextBoolean();
	
	if (idade >= 18 && idade <= 69) {
    if (idade >= 60 && idade <= 69) {
        if (first) {
            System.out.println(Doador + ", você não está apto para doar sangue!");
        } else {
            System.out.println(Doador + ", você está apto para doar sangue.");
        }
    } else {
        System.out.println(Doador + ", você está apto para doar sangue.");
    }
} else {
    System.out.println(Doador + ", você não está apto para doar sangue!");
}

ler.close();
}

}




	

	
	
         
	
	
	 
	




package fr.yoanbor.TP1;
import java.util.Scanner;

public class Exo_06_test_simple {

	public static void main(String[] args) {
		int number;
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Entrer un nombre :");
		number = saisieUtilisateur.nextInt();
		saisieUtilisateur.close();

		 
		if(number % 2 == 0) { 
			System.out.println("Nombre pair");
		} else {
			System.out.println("Nombre Impair");
		}
	}

}

package fr.yoanbor.TP1;

import java.util.Scanner;

public class Exo_07_annee_bissextile {

	public static void main(String[] args) {
			int annee;
			Scanner scanner = new Scanner(System.in);
	        System.out.println("Veuillez entrer une année : ");
	        annee = scanner.nextInt();
	        scanner.close();

	        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
				System.out.print("Bisextile" );
			}
			else {
				System.out.print("Non bisextile" );
			}
	    }
	}

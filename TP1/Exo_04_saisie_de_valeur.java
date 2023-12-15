package fr.yoanbor.TP1;
import java.util.Scanner;

public class Exo_04_saisie_de_valeur {

	public static void main(String[] args) {
			//le (int) = génère en nombre entier
			int rayon;
			Scanner saisieUtilisateur = new Scanner(System.in);
			System.out.println("Veuillez saisir un entier :");
			rayon = saisieUtilisateur.nextInt();
			saisieUtilisateur.close();
			System.out.println((int) (Math.PI * (rayon * 2)));

	}

}

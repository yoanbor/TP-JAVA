package fr.yoanbor.TP1;

import java.text.Normalizer;
import java.util.Scanner;

public class Exo_08_ter_Mois {

	public static void main(String[] args) {
		
		String Mois;
		int annee;
		int days = 0;
		
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Entrer un mois : ");
		Mois = traiterMois(saisieUtilisateur.nextLine().toLowerCase());
		
		System.out.println("Entrer une année : ");
		annee = saisieUtilisateur.nextInt();
		saisieUtilisateur.close();
		
		switch (Mois)  {
				case "janvier", "mars", "mai", "juillet", "aout", "octobre", "decembre":
					days = 31;
					break;
				case "fevrier" :
					days = isbissextile(annee) ? 29 : 28;
					break;
				case "avril", "juin", "septembre", "novembre":
					days = 30;
					break;
				default :
					System.out.println("Nom inconnu");
					
		}
		
		System.out.println("Le mois de " + Mois + " à " + days + " jours");
		
	}
	
	 public static String traiterMois(String mois) {
		 	String moisSansCaracteresSpeciaux = Normalizer.normalize(mois, Normalizer.Form.NFD);
	        String sansAccents = moisSansCaracteresSpeciaux.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	        // Retourner le résultat traité
	        return sansAccents;
	    }

	public static boolean isbissextile(int annee) {
	
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
			return true;
		}
		else {
			return false;
		}
    }
}


package fr.yoanbor.TP1;

import java.util.Scanner;

public class Exo_08_Mois {

	public static void main(String[] args) {
		byte Mois;
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Entrer un nombre entre 1 et 12 (pas de 0 avant un chiffre):");
		Mois = saisieUtilisateur.nextByte();
		saisieUtilisateur.close();
		
		/* if (Mois == 1 || Mois == 3 || Mois == 5 || Mois == 7 || Mois == 8 || Mois == 10 || Mois == 12) {
			System.out.println("31 jours");
		} else if (Mois == 4 || Mois == 6 || Mois == 9 || Mois == 11) {
		System.out.println("30 jours");
	} else { 
		System.out.println("28 jours");
	} */
		
		
		switch (Mois)  {
				case 1 :
					System.out.println("31 jours");
					break;
				case 2 :
					System.out.println("28 jours");
					break;
				case 3 :
					System.out.println("31 jours");
					break;
				case 4 :
					System.out.println("30 jours");
					break;
				case 5 :
					System.out.println("31 jours");
					break;
				case 6 :
					System.out.println("30 jours");
					break;
				case 7 :
					System.out.println("31 jours");
					break;
				case 8 :
					System.out.println("31 jours");
					break;
				case 9 :
					System.out.println("30 jours");
					break;
				case 10 :
					System.out.println("31 jours");
					break;
				case 11 :
					System.out.println("30 jours");
					break;
				case 12 :
					System.out.println("31 jours");
					break;
				default :
					System.out.println("mettre un nombre entre 1 et 12");
					
		}
		
		}
	} 

		
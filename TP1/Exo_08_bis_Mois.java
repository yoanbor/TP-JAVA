package fr.yoanbor.TP1;

import java.util.Scanner;

public class Exo_08_bis_Mois {

	public static void main(String[] args) {
		String Mois;
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Entrer un mois (n'oubliez pas les accents!)");
		Mois = saisieUtilisateur.nextLine().toLowerCase();
		saisieUtilisateur.close();
		
		/* if (Mois == 1 || Mois == 3 || Mois == 5 || Mois == 7 || Mois == 8 || Mois == 10 || Mois == 12) {
			System.out.println("31 jours");
		} else if (Mois == 4 || Mois == 6 || Mois == 9 || Mois == 11) {
		System.out.println("30 jours");
	} else { 
		System.out.println("28 jours");
	} */
		
		switch (Mois)  {
				case "janvier" :
					System.out.println("31 jours");
					break;
				case "février" :
					System.out.println("28 jours");
					break;
				case "mars" :
					System.out.println("31 jours");
					break;
				case "avril" :
					System.out.println("30 jours");
					break;
				case "mai" :
					System.out.println("31 jours");
					break;
				case "juin" :
					System.out.println("30 jours");
					break;
				case "juillet" :
					System.out.println("31 jours");
					break;
				case "août" :
					System.out.println("31 jours");
					break;
				case "septembre" :
					System.out.println("30 jours");
					break;
				case "octobre" :
					System.out.println("31 jours");
					break;
				case "novembre" :
					System.out.println("30 jours");
					break;
				case "décembre" :
					System.out.println("31 jours");
					break;
				default :
					System.out.println("mettre un nombre entre 1 et 12");
					
		}
		
		}
	} 

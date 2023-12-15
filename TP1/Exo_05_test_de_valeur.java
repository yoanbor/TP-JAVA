package fr.yoanbor.TP1;
import java.util.Scanner;

public class Exo_05_test_de_valeur {

	public static void main(String[] args) {
		byte age;
		Scanner saisieUtilisateur = new Scanner(System.in);
		System.out.println("Quel est votre âge ? :");
		age = saisieUtilisateur.nextByte();
		saisieUtilisateur.close();
		
		if(age >= 18) {
			System.out.println("vous êtes majeur");

		} else {
			System.out.println("vous êtes mineurs");

		}
			}

}

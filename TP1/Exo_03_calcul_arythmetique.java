package fr.yoanbor.TP1;

public class Exo_03_calcul_arythmetique {

	public static void main(String[] args) {
		//rayon aléatoire entre 0 et 10
		//le (int) = génère en nombre entier
		int rayon = (int) (Math.random() * 10);
		System.out.println(rayon);
		System.out.println((int) (Math.PI * (rayon * 2)));
	}

}

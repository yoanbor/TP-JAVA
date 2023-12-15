package fr.yoanbor.TP1;

public class Exo_12_echanger_les_valeurs_de_2_variables {
    public static void main(String[] args) {
        // Déclaration et initialisation de deux variables
        int a = 5;
        int b = 10;

        // Échange des valeurs en utilisant une variable temporaire
        int temp = a;
        a = b;
        b = temp;

        // Affichage des valeurs après l'échange
        System.out.println("\nAprès l'échange :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

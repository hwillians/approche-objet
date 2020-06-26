package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {

		// Dans la méthode main, créez une instance de la classe Compte avec un numéro
		// et un solde de votre choix.
		Compte person1 = new Compte("00000000000J", 30000);

		// b. affichez l’instance créée avec System.out.println(...)
		System.out.println(person1);

		// c. Que constatez-vous ?
		// (fr.diginamic.banque.entites.Compte@6ff3c5b5)

	}

}

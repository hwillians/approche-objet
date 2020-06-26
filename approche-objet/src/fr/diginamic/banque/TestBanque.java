package fr.diginamic.banque;

import java.util.Scanner;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		// Dans la méthode main, créez une instance de la classe Compte avec un numéro
		// et un solde de votre choix.
		Compte compte1 = new Compte("00000000000J", 30000);
		CompteTaux compte2 = new CompteTaux("0000000000AB", 50000, 5.5);
		double soldeGlobal = 0;

		// b. affichez l’instance créée avec Sytem.out.println(...)

		// Creez un tableau de comptes pouvant contenir 2 comptes :
		// i. un compte normal
		// ii. un compte avec un taux
		// iii. Faites une boucle afin d’afficher les informations de vos divers comptes
		// ainsi que le solde global.

		Compte[] comptes = { compte1, compte2 };

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i] + "\n\n");
			if (i != comptes.length - 1) {
				continue;
			}
			soldeGlobal += comptes[i].getSoldeCompte();
			System.out.println("Solde Global = " + soldeGlobal);
		}

		// b. exécutez votre classe TestBanque et vérifiez que les informations
		// affichées sont justes.

	}

}

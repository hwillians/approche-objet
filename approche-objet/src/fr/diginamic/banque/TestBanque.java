package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte1 = new Compte("00000000000J", 30000);
		CompteTaux compte2 = new CompteTaux("0000000000AB", 50000, 5.5);
		double soldeGlobal = 0;

		Compte[] comptes = { compte1, compte2 };

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i] + "\n\n");
			if (i != comptes.length - 1) {
				continue;
			}
			soldeGlobal += comptes[i].getSoldeCompte();
			System.out.println("Solde Global = " + soldeGlobal);
		}

	}

}

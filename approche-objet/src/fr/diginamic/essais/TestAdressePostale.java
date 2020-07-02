
package fr.diginamic.essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adresse1 = new AdressePostale(240, "Rue", "de la voie lactée", 34990, "Juvigac");

		AdressePostale adresse2 = new AdressePostale(2, "Rue", "Rue du cheval blanc", 34000, "Montpellier");

		System.out.println(adresse1);
	}

}
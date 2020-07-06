package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;

import fr.diginamic.recensement.entites.Categorie;
import fr.diginamic.recensement.entites.Ville;

public class PopTotale {
	public static void affiche(ArrayList<Ville> villes, String type, String valeur) {

		HashMap<String, Integer> map = CreerMap.genererMap(villes, type, valeur);

		int populationTotale = 0;
		for (int somme : map.values()) {
			populationTotale += somme;
		}

		System.out.println("Population du "+type+" " + valeur + " = " + populationTotale);

	}
}
package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;
import fr.diginamic.recensement.entites.Ville;

public class PopTotale {
	public static void affiche(ArrayList<Ville> villes, String type, String valeur) {

		HashMap<String, Integer> map = CreerMap.commune(villes, type, valeur);

		int total = CalculePopulation.calcul(map, type, valeur);

		System.out.println("Population du " + type + " " + valeur + " = " + total);

	}
}
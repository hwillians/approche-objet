package fr.diginamic.recensement.outils;

import java.util.HashMap;

public class CalculePopulation {

	public static int calcul(HashMap<String, Integer> map, String type, String valeur) {

		int populationTotale = 0;
		for (int somme : map.values()) {
			populationTotale += somme;
		}
		return populationTotale;

	}
}

package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;

import fr.diginamic.recensement.entites.Categorie;
import fr.diginamic.recensement.entites.Ville;

public class CreerMap {

	// Stocke la population par commune de la categorie choisie
	public static HashMap<String, Integer> commune(ArrayList<Ville> villes, String type, String valeur) {

		HashMap<String, Integer> map = new HashMap<>();

		// tous les communes du "Département" choisi
		switch (type) {

		case ("Département"):
			for (Ville v : villes) {
				if (v.getCodeDep().equals(valeur)) {
					map.put(v.getCommune(), v.getPopulation());
				}
			}
			break;
		// //tous les communes de la "Région" choisi
		case ("Region"):

			for (Ville v : villes) {
				if (v.getCodeRegion().equals(valeur)) {
					map.put(v.getCommune(), v.getPopulation());
				}
			}
			break;
		default:
		}
		System.out.println("preube" + map.size());
		return map;

	}

	// Stocke le population par categorie choisi
	public static HashMap<String, Integer> categorie(ArrayList<Categorie> list, String type, String valeur) {

		HashMap<String, Integer> map = new HashMap<>();
		if (valeur == null) {
			type = "France";
		}
		for (Categorie c : list) {
			switch (type) {
			// la population par département
			case ("Département"):

				if (c.getNom().equals(valeur)) {
					Integer total = map.get(c.getNom());
					if (total == null) {
						map.put(c.getNom(), c.getPopulation());
					} else {
						total += c.getPopulation();
						map.put(c.getNom(), c.getPopulation());

					}
				}

				break;
			// la population para région
			case ("Région"):

				if (c.getNom().equals(valeur)) {
					Integer total = map.get(c.getNom());
					if (total == null) {
						map.put(c.getNom(), c.getPopulation());
					} else {
						total += c.getPopulation();
						map.put(c.getNom(), c.getPopulation());
					}
				}

				break;
			case ("France"):
				map.put(c.getNom(), c.getPopulation());

				break;
			default:
			}

		}
		return map;
	}
}
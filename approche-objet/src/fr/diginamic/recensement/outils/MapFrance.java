package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;

import fr.diginamic.recensement.entites.Categorie;
import fr.diginamic.recensement.entites.Ville;

public class MapFrance {
	public static HashMap<String, Integer> commune(ArrayList<Ville> villes, String type) {

		HashMap<String, Integer> map = new HashMap<>();

		for (Ville v : villes) {
			Integer total; 
			switch (type) {
			// la population par département
			case ("Département"):
				total = map.get(v.getCodeDep());
				if (total == null) {
					map.put(v.getCodeDep(), v.getPopulation());
				} else {
					total += v.getPopulation();
					map.put(v.getCodeDep(), total);
				}
				break;
			// la population para région
			case ("Région"):
				total = map.get(v.getCodeRegion());
				if (total == null) {
					map.put(v.getCodeRegion(), v.getPopulation());

				} else {
					total += v.getPopulation();
					map.put(v.getCodeRegion(), total);
				}

				break;
			case ("France"):
				map.put(v.getCommune(), v.getPopulation());

				break;
			default:
			}

		}
		return map;
	}
}

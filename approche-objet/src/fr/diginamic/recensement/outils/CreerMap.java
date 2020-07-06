package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;

import fr.diginamic.recensement.entites.Ville;

public class CreerMap {

	public static HashMap<String, Integer> genererMap(ArrayList<Ville> villes, String type, String valeur) {

		HashMap<String, Integer> map = new HashMap<>();
		if (type.equals("Département")) {
		
			for (int i = 0; i < villes.size(); i++) {
				if (villes.get(i).getCodeDep().equals(valeur)) {
					map.put(villes.get(i).getCommune(), villes.get(i).getPopulation());
				}
			}
		} else if (type.equals("Region")) {
		
			for (int i = 0; i < villes.size(); i++) {
				if (villes.get(i).getCodeRegion().equals(valeur)) {
					map.put(villes.get(i).getCommune(), villes.get(i).getPopulation());
				}
			}
		}

		return map;
	}

}

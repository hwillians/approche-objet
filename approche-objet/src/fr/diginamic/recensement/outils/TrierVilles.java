package fr.diginamic.recensement.outils;

import java.util.ArrayList;

import fr.diginamic.recensement.entites.Ville;

public class TrierVilles {
	public static ArrayList<Ville> trier(ArrayList<Ville> villes, String type, String valeur) {

		ArrayList<Ville> villesTries = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDep().equals("34")) {
				villesTries.add(villes.get(i));

			} else if (villes.get(i).getCodeRegion().equals("34")) {
				villesTries.add(villes.get(i));
			}

		}

		return villesTries;

	}

}

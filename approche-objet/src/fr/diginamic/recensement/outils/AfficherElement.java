package fr.diginamic.recensement.outils;

import java.util.ArrayList;

import fr.diginamic.recensement.entites.Ville;

public class AfficherElement {

	public static void affiche(ArrayList<Ville> villes, String chaine) {

		for (int i = 0; i < villes.size(); i++) {

			if (villes.get(i).getCommune().equals(chaine)) {
				System.out.println(villes.get(i));
			}
		}

	}
}

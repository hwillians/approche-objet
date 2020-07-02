package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListeVille {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));

		int taille = 0;
		int temoin = 0;

		for (int i = 0; i < villes.size(); i++) {

			if (villes.get(i).getNbHabitants() > taille) {
				taille = villes.get(i).getNbHabitants();
				temoin = i;
			}
		}
		System.out.println(
				"La ville la plus peupée est : " + villes.get(temoin).getNom() + " avec " + taille + " habitants.");

		temoin = 0;
		for (int i = 1; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() < villes.get(i - 1).getNbHabitants()) {
				temoin = i;
			}
		}

		villes.remove(temoin);
		System.out.println(" \n--------------- ");
		for (int i = 0; i < villes.size(); i++) {
			System.out.println(villes.get(i));
		}

	}

}

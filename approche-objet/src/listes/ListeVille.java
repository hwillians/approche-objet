package listes;

import java.util.ArrayList;
import java.util.List;

public class ListeVille {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));

		//Ville ref = new Ville("", 0);
		Ville ref = villes.get(0);

		for (int i = 0; i < villes.size(); i++) {

			if (villes.get(i).getNbHabitants() > ref.getNbHabitants()) {
				ref = villes.get(i);
			}
		}
		System.out
				.println("La ville la plus peupée est : " + ref.getNom() + " avec " + ref.getNbHabitants() + " habitants.");

		ref = villes.get(0);

		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() < ref.getNbHabitants()) {
				ref = villes.get(i);
			}
		}

		villes.remove(ref);

		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en
		// majuscules

		// for (int i = 1; i < villes.size(); i++) {
		// if (villes.get(i).getNbHabitants() > 100_000) {
		// String toUp = villes.get(i).getNom().toUpperCase();
		// villes.set(i, new Ville(toUp, villes.get(i).getNbHabitants()));
		//
		// }
		// }
		
		for (Ville ville : villes) {
			if(ville.getNbHabitants() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}

		System.out.println(" \n--------------- ");
		for (int i = 0; i < villes.size(); i++) {
			System.out.println(villes.get(i));
		}

	}

}

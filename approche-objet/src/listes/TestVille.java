package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {

	/**
	 * @param args
	 */
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

		// Methodes pour trier des liste
		// Premier méthode, avec l'interface Comparable sur la classe ville
		
		// tri les villes par nombre d'habitans 
		Collections.sort(villes);

		// Affiche la liste de Villes
		villes.forEach(v -> System.out.println(v));
		System.out.println(" \n--------------- ");
		
		// Deuxiéme methode, avec l'interface Comparator sur des classe "externes" à villes
		// Tri les villes par nom de ville
		Collections.sort(villes, new ComparatorNom());
		
		// Affiche la liste de Villes
		villes.forEach(v -> System.out.println(v));
		System.out.println(" \n--------------- ");
		
		// tri les villes par nombre d'habitans 
		Collections.sort(villes, new ComparatorHabitant());
		
		// Affiche la liste 
		villes.forEach(v -> System.out.println(v));
	}

}

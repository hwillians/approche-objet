package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {

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
		
		Collections.sort(villes);
		
		for(int i=0; i<villes.size();i++) {
			System.out.println(villes.get(i));
		}
		System.out.println(" \n--------------- ");
		Collections.sort(villes,new ComparatorNom());
		for(int i=0; i<villes.size();i++) {
			System.out.println(villes.get(i));
		}
		System.out.println(" \n--------------- ");
		Collections.sort(villes,new ComparatorHabitant());
		for(int i=0; i<villes.size();i++) {
			System.out.println(villes.get(i));
		}
	}

}

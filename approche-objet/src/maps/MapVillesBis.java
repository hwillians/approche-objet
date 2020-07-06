package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import listes.Ville;

public class MapVillesBis {
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

		HashMap<String, Ville> mapVilles = new HashMap<>();

		for (int i = 0; i < villes.size(); i++) {

			mapVilles.put(villes.get(i).getNom(), villes.get(i));

		}

		Ville ref = new Ville("", 100_000_000);

		Iterator<String> ite = mapVilles.keySet().iterator();
		while (ite.hasNext()) {
			String k = ite.next();
			if (mapVilles.get(k).getNbHabitants() < ref.getNbHabitants()) {
				ref = mapVilles.get(k);
			}

		}

		mapVilles.remove(ref.getNom());

	}

}

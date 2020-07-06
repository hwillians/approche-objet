package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		ArrayList<Pays> pays = new ArrayList<>();

		pays.add(new Pays("France", 65_000_000, "Europe"));
		pays.add(new Pays("Allemagne", 80_000_000, "Europe"));
		pays.add(new Pays("Belgique", 10_000_000, "Europe"));
		pays.add(new Pays("Russie", 150_000_000, "Asie"));
		pays.add(new Pays("Chine", 1_400_000_000, "Asie"));
		pays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
		pays.add(new Pays("Australie", 20_000_000, "Océanie"));

		HashMap<String, Integer> mapComp = new HashMap<>();

		for (Pays p : pays) {
			Integer compteur = mapComp.get(p.getContinent());

			if (compteur == null) {
				mapComp.put(p.getContinent(), 1);
			} else {
				compteur++;
				mapComp.put(p.getContinent(), compteur);

			}

		}

		Iterator<String> ite = mapComp.keySet().iterator();
		while (ite.hasNext()) {
			String k = ite.next();
			System.out.println(k + " " + mapComp.get(k));

		}

	}
}

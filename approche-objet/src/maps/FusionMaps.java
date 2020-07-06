package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMaps {

	public static void main(String[] args) {
		// Création map1

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		Iterator<Integer> iteMap1 = map1.keySet().iterator();
		while (iteMap1.hasNext()) {
			Integer k = iteMap1.next();
			map3.put(k, map1.get(k));
		}

		Iterator<Integer> iteMap2 = map2.keySet().iterator();
		while (iteMap2.hasNext()) {
			Integer k = iteMap2.next();
			map3.put(k, map2.get(k));
		}

		Iterator<Integer> iteMap3 = map3.keySet().iterator();
		while (iteMap3.hasNext()) {
			Integer k = iteMap3.next();
			System.out.println(k + " " + map3.get(k));
		}

	}

}

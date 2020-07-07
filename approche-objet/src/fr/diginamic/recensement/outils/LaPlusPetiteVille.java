package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.recensement.entites.Ville;

public class LaPlusPetiteVille {
	
	public static void affiche(ArrayList<Ville> villes, String type, String dep) {
		
		HashMap<String, Integer> map = CreerMap.commune(villes, type ,dep);
		
		int ref = 1000000000;
		String keyRef = "";

		Iterator<String> ite = map.keySet().iterator();

		while (ite.hasNext()) {
			String k = ite.next();
			if (map.get(k) < ref) {
				ref = map.get(k);
				keyRef = k;

			}
		}

		System.out.println("La plus petite ville du département est : " + keyRef + " avec "
				+ map.get(keyRef) + " habitantes");
	}

}

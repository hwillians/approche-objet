package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.recensement.entites.Categorie;

public class CreerListe {
	public static ArrayList<Categorie> toList(HashMap<String, Integer> map) {

		ArrayList<Categorie> list = new ArrayList<>();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k = it.next();
			Categorie e = new Categorie(k, map.get(k));
			list.add(e);	
		}
		return list;

	}
}

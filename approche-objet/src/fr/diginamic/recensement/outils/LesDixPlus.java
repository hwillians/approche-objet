package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import fr.diginamic.recensement.ComparateurVille;
import fr.diginamic.recensement.entites.Categorie;
import fr.diginamic.recensement.entites.Ville;

public class LesDixPlus {

	private static ArrayList<Ville> newV;
	private static ArrayList<Categorie> newList;

	public static void grandesVilles(ArrayList<Ville> villes, String type, String valeur) {

		// Affiche les 10 plus grandes villes du département
		newV = TrierVilles.trier(villes, type, valeur);
		Collections.sort(newV, new ComparateurVille(true));
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "._ " + newV.get(i));
		}

	}

	public static void petitesVilles(ArrayList<Ville> villes, String type, String valeur) {
		// Affiche les 10 plus petites villes du département
		newV = TrierVilles.trier(villes, type, valeur);
		Collections.sort(newV, new ComparateurVille(false));
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "._ " + newV.get(i));
		}
	}

	public static void grandesPays(ArrayList<Ville> villes, String type) {
		
		//Cree un map avec tous les communes
		HashMap <String,Integer> map = MapFrance.commune(villes, type);
		
		//transforme en list para categorie
		ArrayList<Categorie> list = CreerListe.toList(map);
		
		//map de population par categories 
		HashMap <String,Integer> mapCat = CreerMap.categorie(list, type, null);
		
		newList = CreerListe.toList(mapCat);
		
		Collections.sort(newList, new ComparateurVille(true));
		 
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "._ " + newList.get(i));
		}
	

	}

	public static void petitesCategories(ArrayList<Ville> villes, String type) {

		HashMap <String,Integer> map = CreerMap.commune(villes, type, null);
		ArrayList<Categorie> list = CreerListe.toList(map);
		HashMap <String,Integer> mapCat = CreerMap.categorie(list, type, null);
		newList = CreerListe.toList(mapCat);
		Collections.sort(newV, new ComparateurVille(false));
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "._ " + newList.get(i));
		}

	}

}

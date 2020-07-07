package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.recensement.ComparateurVille;
import fr.diginamic.recensement.entites.Ville;

public class LesDixPlus {

	
	private static ArrayList<Ville> newV;
	
	public static void grandesVilles(ArrayList<Ville> villes, String type, String valeur) {

		// Affiche les 10 plus grandes villes du département
		
		newV = TrierVilles.trier(villes, type, valeur);
		Collections.sort(newV, new ComparateurVille(true));
		for (int i = 0; i < 10; i++) {
			System.out.println(i +1+ "._ " + newV.get(i));
		}

	}

	public static void petitesVilles(ArrayList<Ville> villes, String type, String valeur) {

		// Affiche les 10 plus petites villes du département
		newV = TrierVilles.trier(villes, type, valeur);
		Collections.sort(newV, new ComparateurVille(false));
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + "._ " + newV.get(i));
		}
	}

}

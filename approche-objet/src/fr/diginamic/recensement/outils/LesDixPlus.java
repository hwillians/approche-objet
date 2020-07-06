package fr.diginamic.recensement.outils;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.recensement.ComparateurVille;
import fr.diginamic.recensement.entites.Ville;

public class LesDixPlus {

	
	private static ArrayList<Ville> villestries;
	
	public static void grandesVilles(ArrayList<Ville> villes, String type, String valeur) {

		// Affiche les 10 plus grandes villes du département
		
		villestries = TrierVilles.trier(villes, type, valeur);
		Collections.sort(villestries, new ComparateurVille('+'));
		for (int i = 0; i < 10; i++) {
			System.out.println(i +1+ "._ " + villes.get(i));
		}

	}

	public static void petitesVilles(ArrayList<Ville> villes, String type, String valeur) {

		// Affiche les 10 plus petites villes du département
		villestries = TrierVilles.trier(villes, type, valeur);
		Collections.sort(villestries, new ComparateurVille('-'));
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + "._ " + villes.get(i));
		}
	}

}

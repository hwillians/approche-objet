package fr.diginamic.recensement.outils;

import fr.diginamic.recensement.entites.Ville;

public class SeparateurChaines {

	public static Ville separateur(String chaine) {

		String[] chaines = chaine.split(";");

		String codeRegion = chaines[0];
		String region = chaines[1];
		String codeDep = chaines[2];
		String codeCommune = chaines[5];
		String commune = chaines[6];
		String populationString = chaines[7];
		int population = Integer.parseInt(populationString.replace(" ", "").trim());

		Ville ville = new Ville(codeRegion, region, codeDep, codeCommune, commune, population);
		return ville;

	}

}

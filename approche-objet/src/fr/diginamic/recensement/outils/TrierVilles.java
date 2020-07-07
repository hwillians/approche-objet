package fr.diginamic.recensement.outils;

import java.util.ArrayList;

import fr.diginamic.recensement.entites.Ville;

public class TrierVilles {
	public static ArrayList<Ville> trier(ArrayList<Ville> villes, String type, String valeur) {

		ArrayList<Ville> villesTries = new ArrayList<>();

		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			
			if (type.equals("Département") && v.getCodeDep().equals(valeur)) {
				villesTries.add(v);

			} else 
			if (type.equals("Region") && villes.get(i).getCodeRegion().equals(valeur)) {
			villesTries.add(villes.get(i));
			}

	}

		return villesTries;

	}

}
//for (Ville v : villes) {
//	if (v.getCodeRegion().equals("76")) {
//		villesTriesReg.add(v);
//	}
//}
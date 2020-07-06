package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.outils.AfficherElement;
import fr.diginamic.recensement.outils.LaPlusPeitieVille;
import fr.diginamic.recensement.outils.LesDixPlus;
import fr.diginamic.recensement.outils.PopTotale;
import fr.diginamic.recensement.outils.SeparateurChaines;
import fr.diginamic.recensement.outils.TrierVilles;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();

		try {

			File file = new File("/Users/helvin/Desktop/Diginamic/POO/Maps/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			// crée les instances Ville
			for (int i = 1; i < lignes.size(); i++) {
				Ville ville = SeparateurChaines.separateur(lignes.get(i));
				villes.add(ville);
			}

			// Affiche les donnes d'un ville
			AfficherElement.affiche(villes, "Montpellier");

			// Affiche la population de tout le département de l’Hérault "34".
			PopTotale.affiche(villes,"Département", "34");

			// Affiche la plus petite ville du département
			LaPlusPeitieVille.affiche(villes, "Département","34");

		
			// Affiche les 10 plus grandes villes du département
			LesDixPlus.grandesVilles(villes, "Département","33");
			
			// Affiche les 10 plus petites villes du département
			LesDixPlus.petitesVilles(villes, "Département","34");
			
			// Affiche la population de toute la région Occitanie
			PopTotale.affiche(villes, "Region","76");
			
//			// Affichez les 10 villes les plus importantes de la région Occitanie
			LesDixPlus.grandesVilles(villes, "Region","76");
			
//
//			ArrayList<Ville> villesTriesReg = new ArrayList<>();
//
//			for (Ville v : villes) {
//				if (v.getCodeRegion().equals("76")) {
//					villesTriesReg.add(v);
//				}
//			}
//
//			Collections.sort(villesTriesReg, new ComparateurVille());
//
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i + 1 + "._ " + villesTries.get(i) + "\n");
//			}
//
//			// Affichez le département le plus peuplé de la région Occitanie
//			HashMap<String, Integer> map = new HashMap<>();
//			for (Ville v : villes) {
//				if (v.getCodeRegion().equals("76")) {
//					Integer total = map.get(v.getCodeDep());
//					if (total == null) {
//						map.put(v.getCodeDep(), v.getPopulation());
//					} else {
//						total += v.getPopulation();
//						map.put(v.getCodeDep(), v.getPopulation());
//					}
//				}
//			}
//
//			ref = 0;
//			keyRef = "";
//
//			Iterator<String> ite2 = map.keySet().iterator();
//
//			while (ite2.hasNext()) {
//				String k = ite2.next();
//				if (map.get(k) > ref) {
//					ref = map.get(k);
//					keyRef = k;
//				}
//			}
//
//			System.out.println("Le département le plus peuplé de la région est le : " + keyRef + " avec "
//					+ map.get(keyRef) + " Habitantes");
//
//			// Affichez les 10 régions les plus peuplées de France
//			
//			// Affichez les 10 département les plus peuplés de France
//			
//			// Affichez les 10 villes les plus peuplées de France.

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

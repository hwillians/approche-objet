package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.outils.AfficherElement;
import fr.diginamic.recensement.outils.LaPlusPetiteVille;
import fr.diginamic.recensement.outils.LesDixPlus;
import fr.diginamic.recensement.outils.PopTotale;
import fr.diginamic.recensement.outils.SeparateurChaines;

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
			PopTotale.affiche(villes, "Département", "34");

			// Affiche la plus petite ville du département
			LaPlusPetiteVille.affiche(villes, "Département", "34");

			// Affiche les 10 plus grandes villes du département
			LesDixPlus.grandesVilles(villes, "Département", "34");

			// Affiche les 10 plus petites villes du département
			LesDixPlus.petitesVilles(villes, "Département", "34");

			// Affiche la population de toute la région Occitanie
			PopTotale.affiche(villes, "Region", "76");

			// Affichez les 10 villes les plus importantes de la région Occitanie
			LesDixPlus.grandesVilles(villes, "Region", "76");

			// Affichez les 10 régions les plus peuplées de France
			LesDixPlus.grandesPays(villes, "Région");

			// Affichez les 10 département les plus peuplés de France
			LesDixPlus.grandesPays(villes, "Département");

			// Affichez les 10 villes les plus peuplées de France
			LesDixPlus.grandesPays(villes, "France");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

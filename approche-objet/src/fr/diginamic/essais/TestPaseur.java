package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parseur;

public class TestPaseur {

	public static void main(String[] args) {

		String chaine = "x-3";
		Expression expr = Parseur.parseur(chaine);
		double resultat = expr.evaluer("x", 6);
		System.out.println(resultat);
		System.out.println(expr);

	}

}

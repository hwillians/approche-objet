package fr.diginamic.parseur;

public class Parseur {

	public static Expression parseur(String chaine) {
		char c = ' ';
		if (chaine.indexOf('+') > 0) {
			c = '+';
		} else if (chaine.indexOf('-') > 0) {
			c = '-';
		} else if (chaine.indexOf('*') > 0) {
			c = '*';
		} else if (chaine.indexOf('/') > 0) {
			c = '/';
		}

		return new Expression(chaine.substring(0, chaine.indexOf(c)), c, chaine.substring(chaine.indexOf(c) + 1));

	}

}

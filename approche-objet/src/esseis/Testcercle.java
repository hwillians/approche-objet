package esseis;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class Testcercle {

	public static void main(String[] args) {

		Cercle[] tabCercles = new Cercle[2];

		tabCercles[0] = CercleFactory.creerCercle(5);
		tabCercles[1] = CercleFactory.creerCercle(25);

		for (int i = 0; i < tabCercles.length; i++) {
			System.out.println("Cercle " + (i + 1) + " rayon= " + tabCercles[i].getRayon() + " : Perimètre = "
					+ tabCercles[i].perimetre() + ", surface est = " + tabCercles[i].surface());
		}

	}

}

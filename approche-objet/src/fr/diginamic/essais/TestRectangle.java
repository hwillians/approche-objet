package fr.diginamic.essais;

import entites.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle[] tabRectangles = new Rectangle[2];

		tabRectangles[0] = new Rectangle(3, 5);
		tabRectangles[1] = new Rectangle(4, 10);

		for (int i = 0; i < tabRectangles.length; i++) {
			System.out.println("Rectangle " + (i + 1) + " largeur = " + tabRectangles[i].getLargeur() + ", longueur = "
					+ tabRectangles[i].getLongueur() + " : perimètre = " + tabRectangles[i].perimetre() + ", surface = "
					+ tabRectangles[i].surface());
		}

	}

}

package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {

		Chambre piece1 = new Chambre(25, 1,"Chambre");
		Cuisine piece2 = new Cuisine(25, 0,"Cuisine");
		Salon piece3 = new Salon(30, 0,"Salon");
		SalleDeBain piece4 = new SalleDeBain(10, 1,"Salle de bain");
		WC piece5 = new WC(10, 1,"WC");

		Maison.ajouterPiece(piece1);
		Maison.ajouterPiece(piece2);
		Maison.ajouterPiece(piece3);
		Maison.ajouterPiece(piece4);
		Maison.ajouterPiece(piece5);
		Maison.ajouterPiece(null);

		System.out.println(Maison.getSuperficieTotale());
		System.out.println(Maison.getsSuperficieParEtage(0));
		System.out.println(Maison.getsSuperficieParEtage(1));
		System.out.println(Maison.getsSuperficieParPiece("Chambre"));
		




	}

}

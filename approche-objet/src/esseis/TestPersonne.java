package esseis;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
	
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 240;
		adresse1.typeVoie = "Rue";
		adresse1.libelleRue = "de la voie Lactée";
		adresse1.CodePostal = 34990;
		adresse1.ville = "Juvignac";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroRue = 2;
		adresse2.typeVoie = "Rue";
		adresse2.libelleRue = "du cheval blanc";
		adresse2.CodePostal = 34000;
		adresse2.ville = "Montpellier";
		
		Personne ludoW = new Personne ();
		ludoW.nom = "Ludovic";
		ludoW.prenom = "Wallendorff";
		ludoW.adresse = adresse1;
		
		Personne joseC = new Personne ();
		joseC.nom = "josé";
		joseC.prenom = "Colina";
		joseC.adresse = adresse2;
		

	}

}

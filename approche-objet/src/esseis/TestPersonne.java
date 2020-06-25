package esseis;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
	
		AdressePostale adresse1 = new AdressePostale(240, "Rue", "de la voie lactée", 34990, "Juvigac");
		
		Personne fulano = new Personne ("Fulano", "De tal");
		fulano.adresse = adresse1;
		
		AdressePostale adresse2 = new AdressePostale(2, "Rue", "Rue du cheval blanc", 34000, "Montpellier");
		
		Personne jose = new Personne ("José", "Colina", adresse2);
		
	}

}

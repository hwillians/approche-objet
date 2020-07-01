package esseis;

import entites.CompteBancaire;
import entites.Personne;

public class TestCompteBancaire {

	public static void main(String[] args) {

		Personne fulano = new Personne("Fulano", "De tal");
		CompteBancaire compte = new CompteBancaire("000000AB", 10.0, fulano);

		compte.crediterMontant(1300.67);
		compte.debiterMontant(543.29);
		System.out.println(compte);

	}

}
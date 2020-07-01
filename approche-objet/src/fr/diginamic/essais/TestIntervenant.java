package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("José", "Pérez", 1300.00);
		Pigiste pigiste1 = new Pigiste("Fulano", "De Tal", 21, 50.0);

		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());

		salarie1.afficherDonnes();
		pigiste1.afficherDonnes();
		
	}

}

package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		CalculMoyenne.ajout(10.0);
		
		System.out.print(CalculMoyenne.calcul());
		
		

	}

}

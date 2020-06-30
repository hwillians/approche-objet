package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
	
	double resultat1 = Operations.calcul(3, 4, '+');
	double resultat2 = Operations.calcul(3, 4, '-');
	double resultat3 = Operations.calcul(3, 4, '*');
	double resultat4 = Operations.calcul(3, 4, '/');
	
	System.out.println(resultat1);
	System.out.println(resultat2);
	System.out.println(resultat3);
	System.out.println(resultat4);

	}
	
}

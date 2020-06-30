package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne []tab = new CalculMoyenne[1];
		
		int i = tab.length;

		System.out.println(i);
		
		tab[i-1].ajout(5);
		
		System.out.println(i-1);
	
		System.out.println(tab[tab.length].calcul());

	}

}

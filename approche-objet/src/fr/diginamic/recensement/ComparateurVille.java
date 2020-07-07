package fr.diginamic.recensement;

import java.util.Comparator;

import fr.diginamic.recensement.entites.Categorie;


public class ComparateurVille implements Comparator<Categorie> {

	private boolean b ;

	
	/**
	 * @param b
	 */
	public ComparateurVille(boolean b) {
		super();
		this.b = b;
	}

	@Override
	public int compare(Categorie o1, Categorie o2) {
		if (b) {
			if (o1.getPopulation() < o2.getPopulation()) {
				return 1;
			}
			if (o1.getPopulation() > o2.getPopulation()) {
				return -1;
			}

			return 0;
		} else {
				if (o1.getPopulation() > o2.getPopulation()) {
					return 1;
				}
				if (o1.getPopulation() < o2.getPopulation()) {
					return -1;
				}

				return 0;
			}
	}

	

	

}

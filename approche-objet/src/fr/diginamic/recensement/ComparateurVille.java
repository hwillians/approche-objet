package fr.diginamic.recensement;

import java.util.Comparator;

import fr.diginamic.recensement.entites.Ville;

public class ComparateurVille implements Comparator<Ville> {

	private char c;

	/**
	 * @param c
	 */
	public ComparateurVille(char c) {
		super();
		this.c = c;
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		if (c == '+') {
			if (o1.getPopulation() < o2.getPopulation()) {
				return 1;
			}
			if (o1.getPopulation() > o2.getPopulation()) {
				return -1;
			}

			return 0;
		} else {
			if (c == '-') {
				if (o1.getPopulation() > o2.getPopulation()) {
					return 1;
				}
				if (o1.getPopulation() < o2.getPopulation()) {
					return -1;
				}

				return 0;
			}
		}
		return 0;
	}

	/**
	 * @return the c
	 */
	public char getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(char c) {
		this.c = c;
	}

}

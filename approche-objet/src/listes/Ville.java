package listes;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public int compareTo(Ville autre) {
		// return this.nom.compareTo(autre.getNom()); (pour les nom)
		if (this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}
		if (this.nbHabitants < autre.getNbHabitants()) {
			return -1;
		}
		return 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return nom + ", nombre d'habitants = " + nbHabitants;
	}

}

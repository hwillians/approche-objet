package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	// le taux de rémunération
	private double taux;

	/**
	 * @param numeroCompte
	 * @param soldeCompte
	 * @param taux
	 */
	public CompteTaux(String numeroCompte, double soldeCompte, double taux) {
		super(numeroCompte, soldeCompte);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + " taux= " + taux;
	}

	/**
	 * @return
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}

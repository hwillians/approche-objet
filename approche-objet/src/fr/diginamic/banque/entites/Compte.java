package fr.diginamic.banque.entites;

public class Compte {

	// la classe Compte a 2 attributs d’instance :
	// i. le numéro de compte
	private String numeroCompte;

	// ii. le solde du compte
	private double soldeCompte;

	// un constructeur avec le numéro de compte et le solde
	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}

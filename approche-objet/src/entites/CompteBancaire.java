package entites;

public class CompteBancaire {
	private String numeroCompte;
	private double solde;
	private Personne propriétaire;

	public CompteBancaire(String numeroCompte, double solde, Personne propriétaire) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.propriétaire = propriétaire;
	}

	public void crediterMontant(double montantAcredite) {
		solde += montantAcredite;
	}

	public void debiterMontant(double montantDebite) {
		solde -= montantDebite;
	}

	@Override
	public String toString() {
		return "Numero Compte= " + numeroCompte + ", solde= " + solde + ", propriétaire= " + propriétaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Personne getPropriétaire() {
		return propriétaire;
	}

	public void setPropriétaire(Personne propriétaire) {
		this.propriétaire = propriétaire;
	}

}

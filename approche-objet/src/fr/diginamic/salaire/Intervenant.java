package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;

	public abstract double getSalaire();

	public abstract void afficherDonnes();

	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "nom= " + nom + ", prenom=" + prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}

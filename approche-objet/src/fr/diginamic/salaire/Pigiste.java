package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	double nombreJours;
	double montantJournalier;

	public Pigiste(String nom, String prenom, double nombreJours, double montantJournalier) {
		super(nom, prenom);
		this.nombreJours = nombreJours;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		return nombreJours * montantJournalier;

	}

	@Override
	public void afficherDonnes() {
		System.out.println("Prenom=" + getPrenom() + ", Nom= " + getNom() + ", Salaire= " + getSalaire() + "€, Status= Pigiste");
	}

	public double getNombreJours() {
		return nombreJours;
	}

	public void setNombreJours(double nombreJours) {
		this.nombreJours = nombreJours;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}

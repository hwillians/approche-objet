package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	double salaireMensuel;

	@Override
	public double getSalaire() {
		return salaireMensuel;

	}

	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public void afficherDonnes() {
		System.out.println(
				"Prenom= " + getPrenom() + ", Nom= " + getNom() + ", Salaire= " + getSalaire() + "€, statut= Salarié");

	}

}

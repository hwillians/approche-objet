package fr.diginamic.banque.entites;

public abstract class Operation {
//	i. la date de l’opération (au format String pour l’instant)
//	ii. le montant de l’opération.
//	Elle a un constructeur avec 2 arguments : date et montant

	private String dateOp;
	private double montant;
	private double solde;

	public Operation(String dateOp, double montant) {
		super();
		this.dateOp = dateOp;
		this.montant = montant;
	}

	public abstract String getType();

	@Override
	public String toString() {
		return "Date = " + dateOp + ", montant= " + montant;
	}

	public String getDateOp() {
		return dateOp;
	}

	public void setDateOp(String dateOp) {
		this.dateOp = dateOp;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	
}

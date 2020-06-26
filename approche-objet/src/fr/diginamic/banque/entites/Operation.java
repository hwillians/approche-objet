package fr.diginamic.banque.entites;

public abstract class Operation {
//	i. la date de l’opération (au format String pour l’instant)
//	ii. le montant de l’opération.
//	Elle a un constructeur avec 2 arguments : date et montant

	String DateOp;
	double montant;

	public Operation(String dateOp, double montant) {
		super();
		DateOp = dateOp;
		this.montant = montant;
	}

	public abstract String getType();
	
	@Override
	public String toString() {
		return "Date = " + DateOp + ", montant= " + montant;
	}


	public String getDateOp() {
		return DateOp;
	}

	public void setDateOp(String dateOp) {
		DateOp = dateOp;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

}

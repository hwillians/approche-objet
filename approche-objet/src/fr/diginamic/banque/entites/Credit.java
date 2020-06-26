package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOp, double montant) {
		super(dateOp, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

}

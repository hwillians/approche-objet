package fr.diginamic.parseur;

public class Expression {

	private String membre1;
	private char operateur;
	private String membre2;

	public Expression(String membre1, char operateur, String membre2) {
		this.membre1 = membre1;
		this.operateur = operateur;
		this.membre2 = membre2;
	}

	public double evaluer(String variable, double valeur) {

		double resultat = 0;
		
		if (variable.equals(this.membre1)) {
			
			switch (this.operateur){
			case ('+') : 
				resultat = valeur + Double.parseDouble(getMembre2());
			break;
			case ('-') : 
				resultat = valeur - Double.parseDouble(getMembre2());
			break;
			case ('*') : 
				resultat = valeur * Double.parseDouble(getMembre2());
			break;
			case ('/') : 
				resultat = valeur / Double.parseDouble(getMembre2());
			break;
			}
			
		}else if (variable.equals(this.membre2)){
			switch (this.operateur){
			case ('+') : 
				resultat = valeur + Double.parseDouble(getMembre1());
			break;
			case ('-') : 
				resultat = valeur - Double.parseDouble(getMembre1());
			break;
			case ('*') : 
				resultat = valeur * Double.parseDouble(getMembre1());
			break;
			case ('/') : 
				resultat = valeur / Double.parseDouble(getMembre1());
			break;
			}
		}else {System.out.println("Verifiez les variables (Attention aux majuscules)");}

		return resultat;
	}

	@Override
	public String toString() {
		return membre1 + " " + operateur + " " + membre2;
	}

	public String getMembre1() {
		return membre1;
	}

	public void setMembre1(String membre1) {
		this.membre1 = membre1;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}

	public String getMembre2() {
		return membre2;
	}

	public void setMembre2(String membre2) {
		this.membre2 = membre2;
	}

}

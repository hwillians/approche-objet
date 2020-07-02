package interfaces;

public class Rectangle implements ObjetGeometrique {

	double longueur;
	double largeur;

	/**
	 *
	 */
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * (longueur + largeur);
	}

	/**
	 *
	 */
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}
	
	/**
	 *
	 */
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * @return
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}

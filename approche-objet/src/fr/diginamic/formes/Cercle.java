package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		
		return Math.pow(rayon, 2.0) * Math.PI;
	}

	@Override
	public double calculerPerimetre() {
	
		return 2 * rayon * Math.PI;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	

}

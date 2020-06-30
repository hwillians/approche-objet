package entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	public double surface() {
		return Math.pow(rayon, 2.0) * Math.PI;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}

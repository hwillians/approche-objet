package interfaces;

public class Cercle implements ObjetGeometrique {

	private double rayon;

	@Override
	public double perimetre() {

		return 2 * rayon * Math.PI;
	}

	@Override
	public double surface() {

		return Math.pow(rayon, 2.0) * Math.PI;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Cercle";
	}
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}

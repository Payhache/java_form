package m2i.cours.java;

public class Cercle extends FormeGeo {
	
	private double rayon;

	public Cercle(Point point, double rayon) {
		setPoint(point);
		setRayon(rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public double perimetre() {
		return Math.PI * 2 * rayon;
	}

}

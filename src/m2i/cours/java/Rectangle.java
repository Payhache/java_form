package m2i.cours.java;

public class Rectangle extends FormeGeo {

	private double longueur;
	private double largeur; 
	public Rectangle(Point point, double longueur, double largeur) {
		setPoint(point);
		setLongueur(longueur);
		setLargeur(largeur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	@Override
	public double perimetre() {
		return (longueur + largeur) * 2;
	}

}

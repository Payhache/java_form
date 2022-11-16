package solution.annexe;

import m2i.cours.java.Point;
import m2i.cours.java.Rectangle;

public class Carre {

	private Rectangle r;
	
	public Carre(Point p, double cote) {
		r = new Rectangle(null, 5,5);
	}

	public double surface() {
		return r.surface();
	}
	
	public double perimetre() {
		return r.perimetre();
	}
	
	public double getCote() {
		return r.getLargeur();
	}
	
	public void setCote(double value) {
		r.setLargeur(value);
		r.setLongueur(value);
	}
}

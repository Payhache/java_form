package m2i.cours.java;

public abstract class FormeGeo {

	private Point point;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	public abstract double surface();
	public abstract double perimetre();
	
}

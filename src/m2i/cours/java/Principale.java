package m2i.cours.java;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(new Point(22,22), 15);
		System.out.println("surface = " + cercle.surface() +" Perimetre = " + cercle.perimetre());
		
		Rectangle rectangle = new Rectangle(null, 15, 10);
		System.out.println("surface = " + rectangle.surface() +" Perimetre = " + rectangle.perimetre());
		
		ArrayList<FormeGeo> lstForm = new ArrayList<FormeGeo>();
		lstForm.add(rectangle);
		lstForm.add(cercle);
		lstForm.add(new Cercle(null, 2));
	}

}

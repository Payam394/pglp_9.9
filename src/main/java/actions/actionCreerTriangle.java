package actions;

import java.util.ArrayList;

import systeme.Dessin;
import systeme.Point;
import systeme.Shape;
import systeme.Triangle;

public class actionCreerTriangle implements Command{
	
	Shape shape;
	ArrayList<Dessin> A = new ArrayList<Dessin>();

	public actionCreerTriangle(String nom, int x1, int y1, int x2, int y2, int x3, int y3,ArrayList<Dessin> a) {	//Cercle
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		Point p3 = new Point(x3,y3);
		this.shape= new Triangle(nom, "triangle", p1, p2, p3);
		this.A = a;
	}


	public void execute() {
		A.add(shape);
	}

}

package actions;

import java.util.ArrayList;

import systeme.Dessin;
import systeme.Point;
import systeme.Rectangle;
import systeme.Shape;

public class actionCreerRectengle implements Command{
	
	Shape shape;
	ArrayList<Dessin> A = new ArrayList<Dessin>();

	public actionCreerRectengle(String nom, int x1, int y1, int x2, int y2, ArrayList<Dessin> a) {	//Cercle
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		this.shape= new Rectangle(nom, "recrengle", p1, p2);
		this.A = a;
	}


	public void execute() {
		A.add(shape);
	}

}

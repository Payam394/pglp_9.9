package actions;

import java.util.ArrayList;

import systeme.Cercle;
import systeme.Dessin;
import systeme.Point;
import systeme.Shape;

public class actionCreerCercle implements Command{
		
		Shape shape;
		ArrayList<Dessin> A = new ArrayList<Dessin>();

		public actionCreerCercle(String nom, int x, int y, int rayon, ArrayList<Dessin> a) {	//Cercle
			Point p = new Point(x,y);
			this.shape= new Cercle (nom , "cercle", p, rayon);
			this.A = a;
		}
	

		public void execute() {
			A.add(shape);
		}


}

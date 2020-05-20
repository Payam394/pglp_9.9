package actions;

import java.util.ArrayList;

import systeme.Carre;
import systeme.Dessin;
import systeme.Point;
import systeme.Shape;

public class actionCreerCarre implements Command{
	
	Shape shape;
	ArrayList<Dessin> A = new ArrayList<Dessin>();

	public actionCreerCarre(String nom, int x, int y, int cote, ArrayList<Dessin> a) {	//Carre
		Point p = new Point(x,y);
		this.shape= new Carre (nom , "carre", p, cote);
		this.A = a;
	}
	


	public void execute() {
		A.add(shape);
	}


}

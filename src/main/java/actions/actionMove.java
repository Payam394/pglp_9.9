package actions;

import systeme.Dessin;
import systeme.Point;

public class actionMove implements Command{
	
	Dessin dessin;
	
	int x;
	int y;
	
	public actionMove(Dessin dessin, int x, int y) {
		super();
		this.dessin = dessin;
		this.x = x;
		this.y = y;
	}

	public void execute() {
		Point p = new Point(x, y);
		dessin.moveTo(p);
	}
}

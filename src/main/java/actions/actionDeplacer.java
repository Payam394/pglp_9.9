package actions;
import systeme.Dessin;

public class actionDeplacer implements Command{
	
	Dessin dessin;
	
	int x;
	int y;
	
	public actionDeplacer(Dessin dessin, int x, int y) {
		super();
		this.dessin = dessin;
		this.x = x;
		this.y = y;
	}

	public void execute() {
		dessin.deplacer(x, y);
	}
}


public class Carre extends Shape{

	private Point centre; 
	private float cote;
	
	
	public Carre(String nom, String type, Point centre, float cote) {
		super(nom, type);

		this.centre=centre;
		this.cote=cote;
	}
/*
	public float surface() {
		return (float) Math.pow(cote, 2);
	}

	public float diametre() {
		return cote * 4;
	}
*/
	public void afficher() {
		System.out.println("Carré'"+this.nom +"'\tPos:(" +
				centre.x + ", " + centre.y + ")\tcoté:" + cote);
	}

	public void deplacer(int x, int y) {
		this.centre.x+=x;
		this.centre.y+=y;
	}

	public void moveTo(Point dest) {
		this.centre=dest;
	}


}

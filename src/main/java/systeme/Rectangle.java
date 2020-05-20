
public class Rectangle extends Shape{
	
	
	private Point centre; 
	private Point p2;
	
	public Rectangle(String nom, String type, Point centre, Point p2) {
		super(nom, type);
		
		this.centre=centre;
		this.p2=p2;
	}

/*
	public float surface() {
		return largeur*hauteur;
	}

	public float diametre() {
		return 2 * (largeur + hauteur);
	}
*/
	public void afficher() {
		System.out.println("Rectengle'"+this.nom +
				"'\tCentre:(" + centre.x + ", " + centre.y +
				"'\tPos2:(" + p2.x + ", " + p2.y);
	}

	public void deplacer(int x, int y) {
		this.centre.x+=x;
		this.centre.y+=y;
	}

	public void moveTo(Point dest) {
		this.centre=dest;
	}


}

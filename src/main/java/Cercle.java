
public class Cercle extends Shape{
	
	
	private Point centre;
	private float rayon;
	
	public Cercle(String nom, String type, float rayon, Point centre) {
		super(nom, type);
		
		this.centre=centre;
		this.rayon=rayon;
	}

	
/*
	public float surface() {
		return rayon * rayon * (float)Math.PI;
		
	}

	public float diametre() {
		return 2 * rayon * (float)Math.PI;
	}
*/
	public void afficher() {
		System.out.println("Cercle'"+this.nom +"'\tPos:(" +
				centre.x + ", " + centre.y + ")\trayon:" + rayon);
	}

	public void deplacer(int x, int y) {
		this.centre.x+=x;
		this.centre.y+=y;
	}

	public void moveTo(Point dest) {
		this.centre=dest;
		
	}

}

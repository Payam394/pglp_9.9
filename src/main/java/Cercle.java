
public class Cercle extends Shape{
	
	private Point centre;
	private float rayon;

	public float surface() {
		return rayon * rayon * (float)Math.PI;
		
	}

	public float diametre() {
		return 2 * rayon * (float)Math.PI;
	}

	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	public void deplacer(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void moveTo(Point dest) {
		// TODO Auto-generated method stub
		
	}

}

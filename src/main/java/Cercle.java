
public class Cercle implements Shape{
	
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

	public int deplacer() {
		// TODO Auto-generated method stub
		return 0;
	}

}

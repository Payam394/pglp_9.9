
public class Rectangle implements Shape{
	
	private Point centre; 
	private float largeur;
	private float hauteur;

	public float surface() {
		return largeur*hauteur;
	}

	public float diametre() {
		return 2 * (largeur + hauteur);
	}

	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	public int deplacer() {
		// TODO Auto-generated method stub
		return 0;
	}


}

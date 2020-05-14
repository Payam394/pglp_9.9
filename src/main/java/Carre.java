
public class Carre implements Shape{
	
	private Point centre; 
	private float cote;

	public float surface() {
		return (float) Math.pow(cote, 2);
	}

	public float diametre() {
		return cote * 4;
	}

	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	public int deplacer() {
		// TODO Auto-generated method stub
		return 0;
	}


}


public class Carre implements Shape{
	
	private Point centre; 
	private float cote;

	public float surface() {
		return (float) Math.pow(cote, 2);
	}

	public float diametre() {
		return cote * 4;
	}


}


public class Triangle extends Shape{
	
	private Point centre; 
	private Point p2; 
	private Point p3; 

	public float surface() {
		return Math.abs (  centre.x*(p2.y-p3.y) + p2.x*(p3.y-centre.y) + p3.x*(centre.y-p2.y)  );
	}

	public float diametre() {
		return distance(centre, p2)+ distance(centre, p3) + distance(p3, p2);
	}
	
	
	private float distance(Point a, Point b) {
		
		return (float) Math.sqrt(  Math.pow((a.y-b.y), 2) +  Math.pow((a.x-b.x), 2));
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

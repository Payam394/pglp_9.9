
public class Triangle implements Shape{
	
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


}

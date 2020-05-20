package systeme;
public class Triangle extends Shape{

	private Point centre; 
	private Point p2; 
	private Point p3; 
	
	
	public Triangle(String nom, String type, Point centre, Point p2, Point p3) {
		super(nom, type);
		
		this.centre=centre;
		this.p2=p2;
		this.p3=p3;
	}
/*
	public float surface() {
		return Math.abs (  centre.x*(p2.y-p3.y) + p2.x*(p3.y-centre.y) + p3.x*(centre.y-p2.y)  );
	}

	public float diametre() {
		return distance(centre, p2)+ distance(centre, p3) + distance(p3, p2);
	}
	
	private float distance(Point a, Point b) {
		
		return (float) Math.sqrt(  Math.pow((a.y-b.y), 2) +  Math.pow((a.x-b.x), 2));
	}
*/
	
	public void afficher() {
		System.out.println("Triangle'"+this.nom +
				"'\tPos1:(" + centre.x + ", " + centre.y +
				")\tPos2:(" + p2.x + ", " + p2.y +
				")\tPos3:(" + p3.x + ", " + p3.y +")");
	}

	public void deplacer(int x, int y) {
		this.centre.x+=x;
		this.centre.y+=y;
	}

	public void moveTo(Point dest) {
		this.centre=dest;
	}


}

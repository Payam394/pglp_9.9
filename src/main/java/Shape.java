
abstract class Shape {

	String nom;
	
	 abstract float surface();
	
	 abstract float diametre();
	
	 abstract void afficher();
	
	 abstract void deplacer(int x, int y);
	 
	 abstract void moveTo(Point dest);

}

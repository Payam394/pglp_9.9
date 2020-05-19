import java.util.ArrayList;

public class Regroupement implements Dessin{ //implements DAOGroupe<Shape> 
	
	ArrayList<Dessin> ensemble = new ArrayList<Dessin>();

	public void afficher() {
		for (Dessin s:ensemble) {
			s.afficher();
		}
		
	}

	
	public void moveTo(Point dest) {
		for (Dessin s:ensemble) {
			s.moveTo(dest);
		}
		
	}


	public void deplacer(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	/*
	
	public ArrayList<Shape> getAll() {
		return ensemble;
	}

	public void add(Shape t) {
		ensemble.add(t);
	}

	public void deplacer(int x, int y) {
		
	}

	public void delete(Shape t) {
		ensemble.remove(t);
	}
	
	*/
}

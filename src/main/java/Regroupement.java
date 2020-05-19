import java.util.ArrayList;

public class Regroupement implements DAOGroupe<Shape>{
	
	ArrayList<Shape> ensemble = new ArrayList<Shape>();
	

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
	
	
}

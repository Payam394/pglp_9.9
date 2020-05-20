package systeme;
import java.util.ArrayList;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		
		ArrayList<Dessin> AllllllDesigns = new ArrayList<Dessin>();
		
		DrawingTUI tui = new DrawingTUI(AllllllDesigns);
		
		Point p= new Point(4, 4);
		Dessin s1 = new Cercle("c1", "cercle", p, 10);
		AllllllDesigns.add(s1);
		
		tui.nextCommand("deplacer");
		AllllllDesigns.get(0).afficher();
		
		
		tui.nextCommand("Carre");
		tui.nextCommand("Triangle");
		
		for (Dessin i : AllllllDesigns) {
			i.afficher();
		}
		
	}

}

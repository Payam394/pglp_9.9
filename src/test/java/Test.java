import static org.junit.Assert.*;

import java.util.ArrayList;

import systeme.Dessin;
import systeme.DrawingTUI;

public class Test {

	ArrayList<Dessin> AllllllDesigns = new ArrayList<Dessin>();
	
	DrawingTUI tui = new DrawingTUI(AllllllDesigns);
	
	@org.junit.Test
	public void testCreeation() {
		tui.nextCommand("cer1 = Cercle((0, 0), 50)");
		tui.nextCommand("car1 = Carre((0, 0), 30)");
		tui.nextCommand("tr1 = Triangle((0, 0),(3, 5), (7, -1))");
		tui.nextCommand("rec1 = Rectengle((1, 2), (6, 3))");
		
		
		for (Dessin i : AllllllDesigns) {
			i.afficher();
		}
		
		
		
		tui.nextCommand("deplacer( cer1, (9, 10)");
		AllllllDesigns.get(0).afficher();
		
		
		tui.nextCommand("move( rec1, (20, 30))");
		AllllllDesigns.get(3).afficher();
		
	}
	
	

}

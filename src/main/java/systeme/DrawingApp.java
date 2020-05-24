package systeme;
import java.util.ArrayList;
import java.util.Scanner;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		
		ArrayList<Dessin> AllllllDesigns = new ArrayList<Dessin>();
		
		DrawingTUI tui = new DrawingTUI(AllllllDesigns);
		
		Scanner myObj = new Scanner(System.in);
		
//		
//		Point p= new Point(4, 4);
//		Dessin s1 = new Cercle("c1", "cercle", p, 10);
//		AllllllDesigns.add(s1);
//		
//		tui.nextCommand("deplacer");
//		AllllllDesigns.get(0).afficher();
//		
		/*
		tui.nextCommand("cer1 = Cercle((0, 0), 50)");
		tui.nextCommand("car1 = Carre((0, 0), 30)");
		tui.nextCommand("tr1 = Triangle((0, 0),(3, 5), (7, -1))");
		tui.nextCommand("rec1 = Rectengle((1, 2), (6, 3))");
		//tui.nextCommand("Triangle");
		*/
		while(true) {
			String userInput = myObj.nextLine();
			tui.nextCommand(userInput);
			
			/*
			for (Dessin i : AllllllDesigns) {
				i.afficher();
			}
			*/
		}
		
		
		
		
		
	}

}

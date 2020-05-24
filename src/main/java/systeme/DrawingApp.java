package systeme;
import java.util.ArrayList;
import java.util.Scanner;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		
		ArrayList<Dessin> AllllllDesigns = new ArrayList<Dessin>();
		
		DrawingTUI tui = new DrawingTUI(AllllllDesigns);
		
		Scanner myObj = new Scanner(System.in);
		
		
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

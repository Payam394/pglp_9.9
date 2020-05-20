package systeme;
import java.util.ArrayList;

import actions.ActionExecuteur;
import actions.Command;
import actions.actionCreerCarre;
import actions.actionCreerTriangle;
import actions.actionDeplacer;

public class DrawingTUI implements Command{
	
	ArrayList<Dessin> AllDesigns = new ArrayList<Dessin>();
	
	
	
	public DrawingTUI(ArrayList<Dessin> allDesigns) {
		super();
		AllDesigns = allDesigns;
	}


	public Command nextCommand(String text) {	//implements Command
		
		
		ActionExecuteur Exe = new ActionExecuteur();
		
		switch (text){
		
		case "deplacer" :
			System.out.println("Executing Command Deplacer");
			Exe.executeCommand(new actionDeplacer( AllDesigns.get(0), 1, 3));
			break;
			
		case "Carre" :
			System.out.println("Creer nouvelle carre");
			Exe.executeCommand(new actionCreerCarre("Cr1", 3, 5, 20, AllDesigns));
			break;
			
		case "Triangle" :
			System.out.println("Creer nouvelle triangle");
			Exe.executeCommand(new actionCreerTriangle("T1", 3, 5, 2, 6, 9, 10, AllDesigns));
			break;
		
			
		
		//default :
		//	System.out.println("No command found");
			
		}
		
		
		return null;
		
	}
	
	
	public void afficheDessin() {
		
	}


	public void execute() {
		// TODO Auto-generated method stub
		
	}

}

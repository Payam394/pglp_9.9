package systeme;
import java.util.ArrayList;

import actions.ActionExecuteur;
import actions.Command;
import actions.actionCreerCarre;
import actions.actionCreerCercle;
import actions.actionCreerRectengle;
import actions.actionCreerTriangle;
import actions.actionDeplacer;

public class DrawingTUI implements Command{
	
	ArrayList<Dessin> AllDesigns = new ArrayList<Dessin>();
	
	
	
	public DrawingTUI(ArrayList<Dessin> allDesigns) {
		super();
		AllDesigns = allDesigns;
	}
	
	public int toInt(String s) {
		int i = Integer.parseInt(s);
		return i;
	}


	public Command nextCommand(String text) {	//implements Command
		
		ActionExecuteur Exe = new ActionExecuteur();
		
		String[] words= text.split("\\W+");
		//String command= words[0];
		
		switch(words[1]) {
		
		case "Carre" :
			System.out.println("Creer nouvelle carre");
			
			Exe.executeCommand(new actionCreerCarre(words[0], toInt(words[2]), toInt(words[3]), toInt(words[4]), AllDesigns));
			break;
			
		case "Cercle" :
			System.out.println("Creer nouvelle cercle");
			
			Exe.executeCommand(new actionCreerCercle(words[0], toInt(words[2]), toInt(words[3]), toInt(words[4]), AllDesigns));
			break;
			
		case "Triangle" :
			System.out.println("Creer nouvelle triangle");
			Exe.executeCommand(new actionCreerTriangle(words[0], toInt(words[2]), toInt(words[3]), toInt(words[4]), toInt(words[5]), toInt(words[6]), toInt(words[7]), AllDesigns));
			break;
			
		case "Rectengle" :
			System.out.println("Creer nouvelle rectengle");
			Exe.executeCommand(new actionCreerRectengle(words[0], toInt(words[2]), toInt(words[3]), toInt(words[4]), toInt(words[5]), AllDesigns));
			break;
		}
		
		
		
		
		switch (words[0]){
		
		case "deplacer" :
			System.out.println("Executing Command Deplacer");
			Exe.executeCommand(new actionDeplacer( AllDesigns.get(0), 1, 3));
			break;
			
		
		case "move" :
			System.out.println("Executing Command Deplacer");
			Exe.executeCommand(new actionDeplacer( AllDesigns.get(0), 1, 3));
			break;
			
		
		
			
		
		//default :
		//	System.out.println("No command found");
			
		}
		
		
		return null;
		
	}
	/*
	public void getIndexOfDessin(String nom) {
		for (Dessin i : AllDesigns) {
			if (i.)
		}
	}
	
	*/
	public void afficheDessin() {
		
	}


	public void execute() {
		// TODO Auto-generated method stub
		
	}

}

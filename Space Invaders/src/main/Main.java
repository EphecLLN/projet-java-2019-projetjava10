package main;

import javax.swing.Timer;
import model.Coordonnees;
import model.Jeu;
import controller.TimerLecture;
import view.View;
import controller.Controller;
import model.Ennemi;
import view.Console;

public class Main {

	public static void main(String[] args) {
		Jeu g = new Jeu();
		g.init();
		View v = new View(g);
		v.init();
		
		Controller controller = new Controller(v , g);	//en lui passer la mue et le model jeu
		v.getFrame().addKeyListener(controller);
		v.getFrame().setFocusable(true);				// pour enregistrer notre clavier
		
		Timer t = new Timer(100 , new TimerLecture(g, v)); // 100 car on refresh toutes les 100 millisecondes l'app
		t.start();	//demare le timer
	
		Console.recharger();
		
		
		//colonnes et lignes :
	
	
		//créer le tableau
		
		
		
		
	
		}
	
	
}


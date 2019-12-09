package main;

import javax.swing.Timer;
import model.Coordonnees;
import model.Jeu;
import controller.TimerLecture;
import view.View;
import controller.Controller;
import model.Ennemi;

public class Main {

	public static void main(String[] args) {
	/*	Jeu g = new Jeu();
		g.init();
		View v = new View(g);
		v.init();
		
		Controller controller = new Controller(v , g);	//en lui passer la mue et le model jeu
		v.getFrame().addKeyListener(controller);
		v.getFrame().setFocusable(true);				// pour enregistrer notre clavier
		
		Timer t = new Timer(100 , new TimerLecture(g, v)); // 100 car on refresh toutes les 100 millisecondes l'app
		t.start();	//demare le timer
	*/	
		
		
		
		
		
		//colonnes et lignes :
		int C = Coordonnees.HAUTEURCONSOLE;
		int L = Coordonnees.LONGUEURCONSOLE;
		
		
		char[][] plateau = new char[C][L];
		
		for(int x = 0 ; x < C ; x++) {
			for(int y = 0 ; y < L ; y++) {
				plateau[x][y] = ' ';
			};
			plateau[Ennemi.positionEnnemi][0] = '*';
			plateau[Coordonnees.SHIP_START_X_CONSOLE][Coordonnees.SHIP_START_Y_CONSOLE] ='$';
		};
		
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print('-');
		System.out.println();
		
		for(int y = 0 ; y < L ; y++){
			System.out.print('|');
			for(int x = 0 ; x < C ; x++){
				System.out.print(" " + plateau[x][y] + " ");
			}
			System.out.print('|');
			System.out.println();
		}
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print('-');
		
	}
}


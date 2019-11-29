package main;

import javax.swing.Timer;
import model.Jeu;
import controller.TimerLecture;
import view.View;
import controller.Controller;

public class Main {

	public static void main(String[] args) {
		Jeu g = new Jeu();
		g.init();
		View v = new View(g);
		v.init();
		
		Controller controller = new Controller(v , g);
		v.getFrame().addKeyListener(controller);
		v.getFrame().setFocusable(true);
		
		Timer t = new Timer(100 , new TimerLecture(g, v));
		t.start();
	}
}


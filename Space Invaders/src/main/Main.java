/**
 * 
 */
package main;

import model.Jeu;
import view.View;
import controller.Controller;
/**
 * @author gauthierbohyn
 *
 */
public class Main {

	public static void main(String[] args) {
		Jeu g = new Jeu();
		g.initialiser();
		View v = new View(g);
		v.init();
		
		Controller controller = new Controller(v , g);
		v.getFrame().addKeyListener(controller);
		v.getFrame().setFocusable(true);
	}
}


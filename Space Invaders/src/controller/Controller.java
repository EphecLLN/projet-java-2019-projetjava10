/**
 * 
 */
package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;


import view.View;
import model.Jeu;
import view.Map;

/**
 * @author gauthierbohyn
 *
 */
public class Controller implements KeyListener{
	private JLabel vaisseauLabel;
	private Jeu j;
	private View v;
	
	public Controller(View v , Jeu j) {
		this.j = j;
		this.v = v;
		this.vaisseauLabel = v.getLabelShip();
	}
	
	
	private void bougerGauche() {
		double x = vaisseauLabel.getBounds().getX()-Map.MOVE_VAISSEAU;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		j.getVaisseau().setX((int)x);
		j.getVaisseau().setY((int)y);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
	}
	
	
	private void bougerDroite() {
		double x = vaisseauLabel.getBounds().getX()+Map.MOVE_VAISSEAU;
		double y = vaisseauLabel.getBounds().getY();
		double width = vaisseauLabel.getBounds().getWidth();
		double height = vaisseauLabel.getBounds().getHeight();
		j.getVaisseau().setX((int)x);
		j.getVaisseau().setY((int)y);
		vaisseauLabel.setBounds((int)x, (int) y, (int)width, (int)height);
	}
	
	private void fire() {
		v.createMissileLabel(j.createMissile((int)vaisseauLabel.getBounds().getX()+(Map.VAISSEAU_WIDTH/2), Map.VAISSEAU_START_Y, true));
		
	}
	
	/**
	 * Fonction permettant de r�aliser une action quand on APPUYE sur une touche du clavier
	 */
	@Override
	public void keyPressed(KeyEvent kev) {
		switch (kev.getKeyCode()) {
			case KeyEvent.VK_LEFT: bougerGauche();break;
			case KeyEvent.VK_RIGHT: bougerDroite();break;
			case KeyEvent.VK_SPACE: fire();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

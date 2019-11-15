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
	private JLabel shipLabel;
	private Jeu g;
	private View v;
	
	public Controller(View v , Jeu g) {
		this.g = g;
		this.v = v;
		this.shipLabel = v.getLabelShip();
	}
	
	private void moveRight() {
		double x = shipLabel.getBounds().getX()+Map.MOVE_VAISSEAU;
		double y = shipLabel.getBounds().getY();
		double width = shipLabel.getBounds().getWidth();
		double height = shipLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		g.getVaisseau().setY((int)y);
		shipLabel.setBounds((int)x, (int) y, (int)width, (int)height);
	}
	
	private void moveLeft() {
		double x = shipLabel.getBounds().getX()-Map.MOVE_VAISSEAU;
		double y = shipLabel.getBounds().getY();
		double width = shipLabel.getBounds().getWidth();
		double height = shipLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		g.getVaisseau().setY((int)y);
		shipLabel.setBounds((int)x, (int) y, (int)width, (int)height);
	}
	
	
	@Override
	public void keyPressed(KeyEvent kev) {
		switch (kev.getKeyCode()) {
			case KeyEvent.VK_LEFT: moveLeft();break;
			case KeyEvent.VK_RIGHT: moveRight();break;
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

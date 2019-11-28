package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import model.Jeu;
import view.View;
import view.Map;

public class Controller implements KeyListener{
	private JLabel vaisseauLabel;
	private Jeu g;
	private View v;
	
	public Controller(View v , Jeu g) {
		this.g = g;
		this.v = v;
		this.vaisseauLabel = v.getLabelShip();
	}
	
	private void bougerDroite() {
		double x = vaisseauLabel.getBounds().getX()+Map.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		g.getVaisseau().setY((int)y);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() + "\n" + "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() + "\n");
		
	}
	
	private void bougerGauche() {
		double x = vaisseauLabel.getBounds().getX()-Map.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		g.getVaisseau().setY((int)y);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() + "\n" + "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() + "\n");
		
	}
	
	private void tir() {
		v.createMissileLabel(g.createMissile((int)vaisseauLabel.getBounds().getX()+(Map.SHIP_WIDTH/2), Map.SHIP_START_Y, true));
		
	}

	
	@Override
	public void keyPressed(KeyEvent kev) {
		switch (kev.getKeyCode()) {
			case KeyEvent.VK_LEFT: bougerGauche();break;
			case KeyEvent.VK_RIGHT: bougerDroite();break;
			case KeyEvent.VK_SPACE: tir();
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

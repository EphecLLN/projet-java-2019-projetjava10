package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JLabel;
import model.Jeu;
import model.Coordonnees;
import view.View;

public class Controller implements KeyListener{ //KeyListener --> pour les touches du clavier
	private JLabel vaisseauLabel;
	private Jeu g;
	private View v;
	
	public Controller(View v , Jeu g) {
		this.g = g;
		this.v = v;
		this.vaisseauLabel = v.getLabelShip();
	}
	
	private void bougerDroite() {
		double x = vaisseauLabel.getBounds().getX()+Coordonnees.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		//System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() + "\n" +/* "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() +*/ "\n");
		//System.out.format("------------------------------------------------\n");
		//affichageConsole();
	}
	
	private void bougerGauche() {
		double x = vaisseauLabel.getBounds().getX()-Coordonnees.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		//System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() /*+ "\n" + "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() + "\n"*/);
		//System.out.format("------------------------------------------------\n");
		//affichageConsole();
	}
	
	private void tir() {
		v.createMissileLabel(g.createMissile((int)vaisseauLabel.getBounds().getX()+(Coordonnees.SHIP_WIDTH/2), Coordonnees.SHIP_START_Y, true));
		
	}
	


	
	
	
	
	
	

	
	private void affichageConsole() {
		
		
		
		System.out.format("-----------------------------------------------------\n");
		//System.out.println(vaisseau);
		System.out.format("-----------------------------------------------------\n");
	}
	
	
	
	@Override
	public void keyPressed(KeyEvent kev) {						// quand on clic sur une touche
		switch (kev.getKeyCode()) {
			case KeyEvent.VK_LEFT: bougerGauche();break;		//la touche de gauche
			case KeyEvent.VK_RIGHT: bougerDroite();break;		// la touche de droite
			case KeyEvent.VK_SPACE: tir();						//touche espace pour tirer
		}
	}

	
	
	//oblige de les laisser a cause du KeyListener
	@Override
	public void keyTyped(KeyEvent e) {			
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

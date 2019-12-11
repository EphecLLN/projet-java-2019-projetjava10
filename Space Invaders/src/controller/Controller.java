package controller;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JLabel;
import model.Jeu;
import model.Coordonnees;
import view.View;
import view.Console;

public class Controller implements KeyListener{ //KeyListener --> pour les touches du clavier
	private JLabel vaisseauLabel;
	private Jeu g;
	private View v;
	
	public Controller(View v , Jeu g) {
		this.g = g;
		this.v = v;
		this.vaisseauLabel = v.getLabelShip();
	}
	
	private  int bougerDroite() {
		double x = vaisseauLabel.getBounds().getX()+Coordonnees.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		//System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() + "\n" +/* "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() +*/ "\n");
		//System.out.format("------------------------------------------------\n");
		//affichageConsole();
		consoleX=consoleX+1;
		return consoleX;
	}
	
	private  int bougerGauche() {
		double x = vaisseauLabel.getBounds().getX()-Coordonnees.MOVE_SHIP;
		double y = vaisseauLabel.getBounds().getY();
		double largeur = vaisseauLabel.getBounds().getWidth();
		double hauteur = vaisseauLabel.getBounds().getHeight();
		g.getVaisseau().setX((int)x);
		vaisseauLabel.setBounds((int)x, (int) y, (int)largeur, (int)hauteur);
		//System.out.format("Coordonnées X du joueur :" + "" + vaisseauLabel.getBounds().getX() /*+ "\n" + "Coordonnées Y du joueur :" + "" + vaisseauLabel.getBounds().getY() + "\n"*/);
		//System.out.format("------------------------------------------------\n");
		//affichageConsole();
		consoleX=consoleX-1;
		return consoleX;
	}
	
	private int  tir() {
		v.createMissileLabel(g.createMissile((int)vaisseauLabel.getBounds().getX()+(Coordonnees.SHIP_WIDTH/2), Coordonnees.SHIP_START_Y, true));
		 
		
		bougeMissileX=bougeMissileX;
		bougeMissileY=bougeMissileY-1;
		tir = true;
		if (bougeMissileY<0) {
			bougeMissileY=Coordonnees.SHIP_START_Y_CONSOLE-1;
		}
		
		return bougeMissileY;
	}
	


	
	
	
	
	
	

	
	private void affichageConsole() {
		
		
		
		System.out.format("-----------------------------------------------------\n");
		//System.out.println(vaisseau);
		System.out.format("-----------------------------------------------------\n");
	}
	
	
	//TEST CONSOLE --------------------------------------------------------
	 public static int consoleX=Coordonnees.SHIP_START_X_CONSOLE;
	 public static int consoleY=Coordonnees.SHIP_START_Y_CONSOLE;
	 public static int bougeMissileY =consoleY;
	 public static int bougeMissileX =consoleX;
	 public static boolean tir=Console.tir;
	 
	 
	 
	
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

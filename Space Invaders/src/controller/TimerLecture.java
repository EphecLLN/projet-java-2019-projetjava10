package controller;

import java.awt.event.ActionEvent;

import model.Ennemi;
import model.Jeu;

import java.awt.event.ActionListener;
import view.View;
//une classe donnee par java que je vais pouvoir activer tous les x temps
//remit à jour toutes les 100 millisecondes automatiquement

public class TimerLecture implements ActionListener { 	
	Jeu g;
	View v;
	boolean crash;
	boolean victoire;
	
	public TimerLecture(Jeu g , View v) {
		this.g = g;
		this.v = v;
		crash=false;
		victoire= false;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//if (g.getShip().isAlive()) {
			g.moveEnnemi();										// deplace les ennemis
			g.moveMissiles();									// deplace les missiles
			if (g.checkJoueurCrash()) g.getVaisseau().setAlive(false);;		// verifie si le joueur est pas mort
			for (Ennemi i : g.checkEnnemiCrash()) i.setAlive(false);		//verifie si les ennemis ne sont pas mort
			g.tirEnnemi();			//pas mort? faire feu au hasard
			v.refresh();		//Ensuite refresh l'ecran
		//}
	}

}

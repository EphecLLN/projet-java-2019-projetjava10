package controller;

import java.awt.event.ActionEvent;

import model.Jeu;

import java.awt.event.ActionListener;
import view.View;

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
			g.moveEnnemi();
			g.moveMissiles();
			if (g.checkJoueurCrash()) g.getVaisseau().setAlive(false);;
			for (Ennemi i : g.checkEnnemiCrash()) i.setAlive(false);
			g.tirEnnemi();
			v.refresh();
		//}
	}

}

/**
 * 
 */
package controller;

import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Ennemi;
import model.Jeu;

/**
 * @author gauthierbohyn
 *
 */
public class TimerListener implements ActionListener {

	private boolean crash;
	private boolean victoire;
	
	Jeu g;
	View v;
	
	
	/**
	 * @param crash
	 * @param victoire
	 */
	
	public TimerListener(Jeu g , View v) {
		this.g = g;
		this.v = v;
		crash=false;
		victoire= false;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		g.moveEnnemis();
		v.refresh();
		if (g.checkJoueurCrash()) g.getVaisseau().setEnVie(false);;
		for (Ennemi i : g.checkEnnemiCrash()) i.setEnVie(false);
		g.tirEnnemis();
		v.refresh();
	//}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

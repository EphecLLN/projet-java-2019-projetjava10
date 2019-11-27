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
	
	Jeu j;
	View v;
	
	
	/**
	 * @param crash
	 * @param victoire
	 */
	
	public TimerListener(Jeu j , View v) {
		this.j = j;
		this.v = v;
		crash=false;
		victoire= false;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		j.moveEnnemis();
		v.refresh();
		if (j.checkJoueurCrash()) j.getVaisseau().setEnVie(false);;
		for (Ennemi i : j.checkEnnemiCrash()) i.setEnVie(false);
		j.tirEnnemis();
		v.refresh();
	//}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

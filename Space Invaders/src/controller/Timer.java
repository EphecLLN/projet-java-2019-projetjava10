/**
 * 
 */
package controller;

import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Jeu;

/**
 * @author gauthierbohyn
 *
 */
public class Timer implements ActionListener {

	private boolean crash;
	private boolean victoire;
	
	Jeu g;
	View v;
	
	
	/**
	 * @param crash
	 * @param victoire
	 */
	public Timer(boolean crash, boolean victoire,Jeu g , View v) {
		super();
		this.crash = crash;
		this.victoire = victoire;
		this.g = g;
		this.v = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		g.moveInvaders();
		v.refresh();
	}
	/**
	 * @return the crash
	 */
	public boolean isCrash() {
		return crash;
	}
	/**
	 * @param crash the crash to set
	 */
	public void setCrash(boolean crash) {
		this.crash = crash;
	}
	/**
	 * @return the victoire
	 */
	public boolean isVictoire() {
		return victoire;
	}
	/**
	 * @param victoire the victoire to set
	 */
	public void setVictoire(boolean victoire) {
		this.victoire = victoire;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

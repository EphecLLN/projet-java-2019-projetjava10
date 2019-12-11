/**
 * 
 */
package model;

import java.util.ArrayList;
import controller.Entite;

/**
 * @author gauthierbohyn
 *
 */
public class MissileConsole extends Entite {

	public boolean joueur; //si true, c'est le joureur qui a tire
	
	public MissileConsole(int x , int y, boolean joueur) {
		this.x = x;
		this.y = y;
		this.joueur=joueur;
		this.hauteur=Coordonnees.MISSILE_HEIGHT;
		this.largeur=Coordonnees.MISSILE_WIDTH;
	}

	@Override
	public void nextTurn() {
	/*	if (joueur) this.y-=Coordonnees.MOVE_MISSILE; // si le joueur a tire, on diminue le y pour faire monter le missile
													// car le y dans java va vers le bas
		else this.y+=Coordonnees.MOVE_MISSILE;		//sinon  c'est que c'est l ennemi qui tire, donc on monte le y pour que le missile diminue
		*/
	}

}

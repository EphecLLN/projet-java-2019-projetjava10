package model;

import controller.Entite;
public class Missile extends Entite{
	
	public boolean joueur; //true means that it is a joueur shoot
	
	public Missile(int x , int y, boolean joueur) {
		this.x = x;
		this.y = y;
		this.joueur=joueur;
		this.hauteur=Coordonnees.MISSILE_HEIGHT;
		this.largeur=Coordonnees.MISSILE_WIDTH;
	}

	@Override
	public void nextTurn() {
		if (joueur) this.y-=Coordonnees.MOVE_MISSILE;
		else this.y+=Coordonnees.MOVE_MISSILE;
		
	}

}

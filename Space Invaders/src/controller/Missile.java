package controller;

import view.Map;
public class Missile extends Entite{
	
	public boolean joueur; //true means that it is a joueur shoot
	
	public Missile(int x , int y, boolean joueur) {
		this.x = x;
		this.y = y;
		this.joueur=joueur;
		this.hauteur=Map.MISSILE_HEIGHT;
		this.largeur=Map.MISSILE_WIDTH;
	}

	@Override
	public void nextTurn() {
		if (joueur) this.y-=Map.MOVE_MISSILE;
		else this.y+=Map.MOVE_MISSILE;
		
	}

}

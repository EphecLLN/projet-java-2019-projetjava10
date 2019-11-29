package model;

import controller.Entite;
public class Vaisseau extends Entite {
	
	
	public Vaisseau(int x , int y) {
		this.x= x;
		this.y= y;
		this.largeur= Coordonnees.SHIP_WIDTH;
		this.hauteur= Coordonnees.SHIP_HEIGHT;
	}

	@Override
	public void nextTurn() {
		// TODO Auto-generated method stub
		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}

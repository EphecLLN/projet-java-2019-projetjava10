package controller;

import view.Map;
public class Vaisseau extends Entite {
	
	
	public Vaisseau(int x , int y) {
		this.x= x;
		this.y= y;
		this.largeur= Map.SHIP_WIDTH;
		this.hauteur= Map.SHIP_HEIGHT;
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

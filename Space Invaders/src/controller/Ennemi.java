package controller;
import view.Map;

public class Ennemi extends Entite{
	
	boolean direction;//true means from the left to the right
	
	public Ennemi(int x, int y, boolean dir) {
		this.x=x;
		this.y=y;
		this.largeur=Map.INVADER_WIDTH;
		this.hauteur=Map.INVADER_HEIGHT;
		this.direction=dir;
	}

	@Override
	public void nextTurn() {
		int x_max = x+2*largeur+Map.MOVE_INVADER_X;
		int x_min = x-largeur-Map.MOVE_INVADER_X;
		if (enVie) {		
		if (direction) {
			if (x_max < Map.MAP_WIDTH) {
				x+=Map.MOVE_INVADER_X;
			} else {
				y+=Map.MOVE_INVADER_Y;
				direction=false;
			}
		} else {
			if (x_min > 0) {
				x-=Map.MOVE_INVADER_X;
			} else {
				y+=Map.MOVE_INVADER_Y;
				direction=true;
			}
		}}
	}
}

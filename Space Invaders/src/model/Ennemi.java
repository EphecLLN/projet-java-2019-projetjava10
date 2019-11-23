/**
 * 
 */
package model;

import controller.Entity;
import view.Map;
/**
 * @author gauthierbohyn
 *
 */
public class Ennemi extends Entity{

	boolean direction;
	
	public Ennemi(int x, int y, boolean dir) {
		this.x=x;
		this.y=y;
		this.largeur=Map.ENNEMI_WIDTH;
		this.hauteur=Map.ENNEMI_HEIGHT;
		this.direction=dir;
	}

	@Override
	public void nextTurn() {
		int x_max = x+2*largeur+Map.MOVE_ENNEMI_X;
		int x_min = x-largeur-Map.MOVE_ENNEMI_X;
		if (enVie) {		
		if (direction) {
			if (x_max < Map.MAP_WIDTH) {
				x+=Map.MOVE_ENNEMI_X;
			} else {
				y+=Map.MOVE_ENNEMI_Y;
				direction=false;
			}
		} else {
			if (x_min > 0) {
				x-=Map.MOVE_ENNEMI_X;
			} else {
				y+=Map.MOVE_ENNEMI_Y;
				direction=true;
			}
		}}
	}
	

}

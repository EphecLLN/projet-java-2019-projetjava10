/**
 * 
 */
package controller;

import view.Map;

/**
 * @author arnog
 *
 */
public class Missile extends Entity {
	
	
	private boolean player;
	
	
	public Missile(int x, int y, boolean player) {
		this.x=x;
		this.y=y;
		this.player=player;
		this.hauteur=Map.MISSILE_HEIGHT;
		this.largeur=Map.MISSILE_WIDTH;
		}
	
	public void nextTurn() {
		if(player) this.y-=Map.MOVE_MISSILE;
		else this.y+=Map.MOVE_MISSILE;
	}
	

}

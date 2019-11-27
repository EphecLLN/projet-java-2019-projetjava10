package controller;
import view.Map;

public class Ennemi extends Entite{
	
	boolean direction;//true means from the left to the right
	boolean moyen =false;
	boolean difficile=true;
	
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
							x+=Map.MOVE_INVADER_X; // pour faire aller vers la droite
						} else {
							if(difficile==true) {
								
								y+= Map.MOVE_INVADER_DIFFICILE_Y;
								
							}	
							else if(moyen = true){
								y+=Map.MOVE_INVADER_MOYEN_Y;
							}else {
							y+=Map.MOVE_INVADER_Y; // pour faire descendre vers le bas
							}
							direction=false;
							
					}
					
				} else {
					
					if (x_min > 0) {
						x-=Map.MOVE_INVADER_X;
					} else {
						if(difficile==true) {
							
							
							y+= Map.MOVE_INVADER_DIFFICILE_Y;
						}
						else if(moyen = true){
							y+=Map.MOVE_INVADER_MOYEN_Y;
						}
						else {
							y+=Map.MOVE_INVADER_Y;
						direction=true;
					}
						direction=true;}
					
					}
				}
	}
}
		
	


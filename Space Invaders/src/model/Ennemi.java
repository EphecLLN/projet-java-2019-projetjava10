package model;
import controller.Entite;
public class Ennemi extends Entite{
	
	boolean direction;//true means from the left to the right
	Difficultes d = new Difficultes();
	
	public Ennemi(int x, int y, boolean dir) {
		this.x=x;
		this.y=y;
		this.largeur=Coordonnees.INVADER_WIDTH;
		this.hauteur=Coordonnees.INVADER_HEIGHT;
		this.direction=dir;
	}

	@Override
	public void nextTurn() {
		int x_max = x+2*largeur+Coordonnees.MOVE_INVADER_X;
		int x_min = x-largeur-Coordonnees.MOVE_INVADER_X;
		
		if (enVie) {	
			if (direction) {
					
					
						if (x_max < Coordonnees.MAP_WIDTH) {
							x+=Coordonnees.MOVE_INVADER_X; // pour faire aller vers la droite
						} else {
							if(d.vitesseDifficile==true) {
								
								y+= Coordonnees.MOVE_INVADER_DIFFICILE_Y;
								
							}	
							else if(d.vitesseNormal = true){
								y+=Coordonnees.MOVE_INVADER_MOYEN_Y;
							}else {
							y+=Coordonnees.MOVE_INVADER_Y; // pour faire descendre vers le bas
							}
							direction=false;
							
					}
					
				} else {
					
					if (x_min > 0) {
						x-=Coordonnees.MOVE_INVADER_X;
					} else {
						if(d.vitesseDifficile==true) {
							
							
							y+= Coordonnees.MOVE_INVADER_DIFFICILE_Y;
						}
						else if(d.vitesseNormal = true){
							y+=Coordonnees.MOVE_INVADER_MOYEN_Y;
						}
						else {
							y+=Coordonnees.MOVE_INVADER_Y;
						direction=true;
					}
						direction=true;}
					
					}
				}
	}
}
		
	


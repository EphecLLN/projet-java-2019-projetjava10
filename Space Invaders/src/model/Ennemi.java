package model;
import controller.Entite;
public class Ennemi extends Entite{
	
	private boolean direction;//true means from the left to the right
	Difficultes d = new Difficultes();
	
	public Ennemi(int x, int y, boolean dir) {
		this.x=x;
		this.y=y;
		this.largeur=Coordonnees.INVADER_WIDTH;
		this.hauteur=Coordonnees.INVADER_HEIGHT;
		this.direction=dir;
	}
	
	
	public static int positionEnnemi=0;
	@Override
	public void nextTurn() { //une metode qui est appellée automatiquement par le Timer lecture
		int x_max = x+2*largeur+Coordonnees.MOVE_INVADER_X;		
		int x_min = x-largeur-Coordonnees.MOVE_INVADER_X;
		
		
		
		 
		                                  
		if (enVie) {	
			if (direction) {			//si vrai, va vers la droite
					
				
				if (x_max < Coordonnees.MAP_WIDTH) {
					x+=Coordonnees.MOVE_INVADER_X; // pour faire aller vers la droite
					positionEnnemi+=1;
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
					
			} else {					// et donc si faux, va vers la gauche
				
				if (x_min > 0) {		// si arrive a 0, met la direction a vrai pour retourner vers la droite
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
		
	


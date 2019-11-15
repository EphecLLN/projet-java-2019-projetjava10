/**
 * 
 */
package model;

import view.Map;

/**
 * @author arnog
 * Classe représentant le jeu
 */
public class Jeu {

/**
 * On créé le Vaisseau
 */
	
	protected Vaisseau vaisseau;
	
	public Jeu() {
		
	}
	
	public void initialiser() {
		
		vaisseau = new Vaisseau(Map.VAISSEAU_START_X, Map.VAISSEAU_START_Y);
		
	}
	

}

/**
 * 
 */
package model;

import view.Map;

/**
 * @author arnog
 * Classe repr�sentant le jeu
 */
public class Jeu {

/**
 * On cree le Vaisseau
 */
	
	protected Vaisseau vaisseau;
	
	public Jeu() {
		
	}
	
	public void initialiser() {
		
		vaisseau = new Vaisseau(Map.VAISSEAU_START_X, Map.VAISSEAU_START_Y);
		
	}

	/**
	 * @return the vaisseau
	 */
	public Vaisseau getVaisseau() {
		return vaisseau;
	}

	/**
	 * @param vaisseau the vaisseau to set
	 */
	public void setVaisseau(Vaisseau vaisseau) {
		this.vaisseau = vaisseau;
	}
	
	salut
	

}

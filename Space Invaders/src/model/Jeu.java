/**
 * 
 */
package model;

import view.Map;

/**
 * @author gauthierbohyn
 * Classe representant le jeu
 */
public class Jeu {

	/**
	 * On cree le Vaisseau
	 */
	
	Vaisseau vaisseau;
	
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
	
	

}

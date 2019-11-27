/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

import view.Map;

/**
 * @author gauthierbohyn
 * Classe representant le jeu
 */
public class Jeu {

	/**
	 * On cree le Vaisseau
	 */
	private List<Ennemi> ennemi;

	protected Vaisseau vaisseau;
	
	public Jeu() {
		ennemi = new ArrayList<Ennemi>();
	}
	
	void createEnnemi(int x, int y, boolean dir) {
		ennemi.add(new Ennemi(x, y, dir));
	}
	
	
	
	public void initialiser() {
		
		vaisseau = new Vaisseau(Map.VAISSEAU_START_X, Map.VAISSEAU_START_Y);
		createEnnemi(100,Map.ENNEMI_START_Y,true);
		createEnnemi(0,Map.ENNEMI_START_Y,true);
		createEnnemi(-100,Map.ENNEMI_START_Y,true);
		createEnnemi(-200,Map.ENNEMI_START_Y,true);
		createEnnemi(-300,Map.ENNEMI_START_Y,true);
	}
	
	public void moveInvaders() {
		for (Ennemi i : ennemi) i.nextTurn();
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

	/**
	 * @return the ennemi
	 */
	public List<Ennemi> getEnnemi() {
		return ennemi;
	}

	/**
	 * @param ennemi the ennemi to set
	 */
	public void setEnnemi(List<Ennemi> ennemi) {
		this.ennemi = ennemi;
	}
	
	
	
	
	

}

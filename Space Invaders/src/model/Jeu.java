/**
 * 
 */
package model;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import view.Map;
import controller.Missile;
import model.Vaisseau;
import controller.Entity;

/**
 * @author gauthierbohyn
 * Classe representant le jeu
 */
public class Jeu {

	/**
	 * On cree le Vaisseau
	 */
	private List<Ennemi> ennemis;
	private List<Missile> missiles;
	protected Vaisseau vaisseau;
	private Random rand;
	
	public Jeu() {
		ennemis = new ArrayList<Ennemi>();
		missiles = new ArrayList<Missile>();
		rand = new Random();
	}
	
	void createEnnemi(int x, int y, boolean dir) {
		ennemis.add(new Ennemi(x, y, dir));
	}
	
	public Missile createMissile(int x, int y, boolean joueur) {
		Missile m = new Missile(x, y, joueur);
		missiles.add(m);
		return m;
	}
	
	public void nextTurn() {
		
	}
	
	public void initialiser() {
		
		vaisseau = new Vaisseau(Map.VAISSEAU_START_X, Map.VAISSEAU_START_Y);
		createEnnemi(100,Map.ENNEMI_START_Y,true);
		createEnnemi(0,Map.ENNEMI_START_Y,true);
		createEnnemi(-100,Map.ENNEMI_START_Y,true);
		createEnnemi(-200,Map.ENNEMI_START_Y,true);
		createEnnemi(-300,Map.ENNEMI_START_Y,true);
	}
	
	private boolean checkCrash(Entity a , Entity b) {
		if ((b.getX() > a.getX()+a.getLargeur()) || (b.getX()+b.getLargeur() < a.getX())) {
			return false;
		} else {
			if ((b.getY()>a.getY()+a.getHauteur()) || (b.getY()+b.getHauteur() < a.getY())) {
				return false;
			} else {
				System.out.println("crash : "+a.getClass().getName()+" "+b.getClass().getName());
				System.out.println("A("+a.getX()+","+a.getY()+"), B("+b.getX()+","+b.getY()+")");
				return true;
			}
		}
	}
	
	public boolean checkJoueurCrash() {
		for (Missile m : missiles) {
			if (!m.player && checkCrash(vaisseau, m)) return true;
		}
		for (Ennemi i : ennemis) {
			if (checkCrash(vaisseau, i)) return true;
		}
		return false;
	}
	
	
	public List<Ennemi> checkEnnemiCrash() {
		List<Ennemi> crashed = new ArrayList<Ennemi>();
		for (Missile m : missiles) {
			if (m.player) {
				for (Ennemi i : ennemis) {
					if (checkCrash(i, m)) crashed.add(i);
				}
			}
		}
		return crashed;
	}
	
	public void moveEnnemis() {
		for (Ennemi i : ennemis) i.nextTurn();
	}
	
	public void moveMissiles() {
		for (Missile m : missiles) m.nextTurn();
	}
	
	public void tirEnnemis() {
		for (Ennemi i : ennemis) {
			if (i.isEnVie()) {
			int dice = rand.nextInt(100) ;
			if (dice <5) createMissile(i.getX()+(i.getLargeur()/2), i.getY(), false);
			}
		}
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
	 * @return the ennemis
	 */
	public List<Ennemi> getEnnemi() {
		return ennemis;
	}

	/**
	 * @param ennemi the ennemi to set
	 */
	public void setEnnemi(List<Ennemi> ennemi) {
		this.ennemis = ennemi;
	}

	/**
	 * @return the ennemis
	 */
	public List<Ennemi> getEnnemis() {
		return ennemis;
	}

	/**
	 * @param ennemis the ennemis to set
	 */
	public void setEnnemis(List<Ennemi> ennemis) {
		this.ennemis = ennemis;
	}

	/**
	 * @return the missiles
	 */
	public List<Missile> getMissiles() {
		return missiles;
	}

	/**
	 * @param missiles the missiles to set
	 */
	public void setMissiles(List<Missile> missiles) {
		this.missiles = missiles;
	}

	/**
	 * @return the rand
	 */
	public Random getRand() {
		return rand;
	}

	/**
	 * @param rand the rand to set
	 */
	public void setRand(Random rand) {
		this.rand = rand;
	}
	
	
	
	
	
	

}

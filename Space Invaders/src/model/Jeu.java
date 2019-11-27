package model;

import java.util.ArrayList;


import model.Jeu;

import view.Map;
import java.util.List;
import java.util.Random;
import controller.Missile;
import controller.Vaisseau;
import controller.Ennemi;
import controller.Entite;

public class Jeu {
	
	private List<Missile> missiles;
	private List<Ennemi> ennemis;
	private Vaisseau vaisseau;
	private Random rand;
	
	public Jeu() {
		missiles = new ArrayList<Missile>();
		ennemis = new ArrayList<Ennemi>();
		rand= new Random();
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
	
	public void init() {
		vaisseau = new Vaisseau(Map.SHIP_START_X , Map.SHIP_START_Y);
		createEnnemi(100,Map.INVADER_START_Y,true);
		createEnnemi(0,Map.INVADER_START_Y,true);
		createEnnemi(-100,Map.INVADER_START_Y,true);
		createEnnemi(-200,Map.INVADER_START_Y,true);
		createEnnemi(-300,Map.INVADER_START_Y,true);
	}

	
	private boolean checkCrash(Entite a , Entite b) {
		if ((b.getX() > a.getX()+a.getLargeur()) || (b.getX()+b.getLargeur() < a.getX())) {
			return false;
		} else {
			if ((b.getY()>a.getY()+a.getHauteur()) || (b.getY()+b.getHauteur() < a.getY())) {
				return false;
			} else {
				System.out.println("\n crash : "+a.getClass().getName()+" "+b.getClass().getName());
				System.out.println("A("+a.getX()+","+a.getY()+"), B("+b.getX()+","+b.getY()+")");
				System.out.println("----------------------------------------------------------");
				return true;
			}
		}
	}
	
	public boolean checkJoueurCrash() {
		for (Missile m : missiles) {
			if (!m.joueur && checkCrash(vaisseau, m)) return true;
		}
		for (Ennemi i : ennemis) {
			if (checkCrash(vaisseau, i)) return true;
		}
		return false;
	}
	
	
	public List<Ennemi> checkEnnemiCrash() {
		List<Ennemi> crashed = new ArrayList<Ennemi>();
		for (Missile m : missiles) {
			if (m.joueur) {
				for (Ennemi i : ennemis) {
					if (checkCrash(i, m)) crashed.add(i);
				}
			}
		}
		return crashed;
	}
	
	public void moveEnnemi() {
		for (Ennemi i : ennemis) i.nextTurn();
	}
	
	public void moveMissiles() {
		for (Missile m : missiles) m.nextTurn();
	}
	
	public void tirEnnemi() {
		for (Ennemi i : ennemis) {
			if (i.enVie()) {
			int dice = rand.nextInt(100) ;
			if (dice <5) createMissile(i.getX()+(i.getLargeur()/2), i.getY(), false);
			}
		}
	}

	public List<Missile> getMissiles() {
		return missiles;
	}

	public List<Ennemi> getEnnemi() {
		return ennemis;
	}

	public Vaisseau getVaisseau() {
		return vaisseau;
	}
	

}

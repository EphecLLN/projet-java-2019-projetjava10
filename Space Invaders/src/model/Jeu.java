package model;

import java.util.ArrayList;


import model.Jeu;

import java.util.List;
import java.util.Random;

import controller.Entite;

public class Jeu {
	
	private List<Missile> missiles;
	private List<MissileConsole> missilesConsole;
	private List<Ennemi> ennemis;
	Vaisseau vaisseau;
	private Random rand;
	Difficultes d = new Difficultes();
	
	
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
	vaisseau = new Vaisseau(Coordonnees.SHIP_START_X , Coordonnees.SHIP_START_Y);
	 
		for(int i = 1; i <= Difficultes.nbrEnnemi; i++){
			createEnnemi(Difficultes.positionStart,Coordonnees.INVADER_START_Y,true);
			Difficultes.positionStart=Difficultes.positionStart-100;
		}
		
	}


	

	
	private boolean checkCrash(Entite a , Entite b) {		// si recouvrement des deux entite donc si il se seperpose
		if ((b.getX() > a.getX()+a.getLargeur()) || (b.getX()+b.getLargeur() < a.getX())) {
			return false;
		} else {
			if ((b.getY()>a.getY()+a.getHauteur()) || (b.getY()+b.getHauteur() < a.getY())) {
				return false;
			} else {
				//System.out.println("Un : "+b.getClass().getName() +" a touché un : "+a.getClass().getName());
				//System.out.println("les positions du choc sont:\n("+a.getX()+","+a.getY()+"), B("+b.getX()+","+b.getY()+")");
				//System.out.println("----------------------------------------------------------");
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
					if (checkCrash(i, m)) {
						crashed.add(i);
					}
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
			int dice = rand.nextInt(100) ;	//c est comme si il lancais un dés de 1 a 100
			if (dice <d.pourcentageTirEnnemi) createMissile(i.getX()+(i.getLargeur()/2), i.getY(), false);	// si moins de pourcentageTirEnnemi, il tir!
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

package controller;

public abstract class Entite {
	int x;
	int y;
	
	int hauteur;
	int largeur;
	
	public boolean enVie=true;
	
	public boolean enVie() {
		return enVie;
	}

	public void setAlive(boolean enVie) {
		this.enVie = enVie;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public abstract void nextTurn();

}

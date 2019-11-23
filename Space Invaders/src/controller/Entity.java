/**
 * 
 */
package controller;

/**
 * @author gauthierbohyn
 *
 */

//test
public abstract class Entity {

	private int x;
	private int y;
	
	public int hauteur;
	public int largeur;
	
	public boolean enVie = true;
	
	public boolean enVie() {
		return enVie;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}



	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	

	/**
	 * @return the hauteur
	 */
	public int getHauteur() {
		return hauteur;
	}



	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}


	/**
	 * @param enVie the enVie to set
	 */
	public void setenVie(boolean enVie) {
		this.enVie = enVie;
	}
	
	public abstract void nextTurn();
	
}

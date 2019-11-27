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
	
	protected int x;
	  protected int y;
	
	  protected int hauteur;
	  protected  int largeur;
	
	 protected boolean enVie = true;
	
	public boolean enVie() {
		return isEnVie();
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


	
	
	public abstract void nextTurn();

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	
}

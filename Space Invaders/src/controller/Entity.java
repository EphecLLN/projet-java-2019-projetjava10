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
	
	public int height;
	public int width;
	
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
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}



	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}


	/**
	 * @param enVie the enVie to set
	 */
	public void setenVie(boolean enVie) {
		this.enVie = enVie;
	}
	
	public abstract void nextTurn();
	
}

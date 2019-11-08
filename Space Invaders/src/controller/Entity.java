/**
 * 
 */
package controller;

/**
 * @author gauthierbohyn
 *
 */
public abstract class Entity {

	private int x;
	private int y;
	
	public int height;
	public int width;
	
	public boolean isAlive = true;
	
	public boolean isAlive() {
		return isAlive;
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
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public abstract void nextTurn();
	
}

/**
 * 
 */
package model;

import view.Map;
/**
 * @author gauthierbohyn
 *
 */
public class Vaisseau {

	protected int x;
	protected int y;
	
	protected int width;
	protected int height;

	public Vaisseau(int x , int y) {
		this.x= x;
		this.y= y;
		this.width= Map.SHIP_WIDTH;
		this.height= Map.SHIP_HEIGHT;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

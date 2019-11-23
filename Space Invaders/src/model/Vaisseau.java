/**
 * 
 */
package model;

import view.Map;
import controller.Entity;
/**
 * @author tongr
 *
 */
public class Vaisseau extends Entity {

	

	public Vaisseau(int x , int y) {
		this.x= x;
		this.y= y;
		this.largeur= Map.VAISSEAU_WIDTH;
		this.hauteur= Map.VAISSEAU_HEIGHT;
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
		return largeur;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.largeur = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return hauteur;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.hauteur = height;
	}

	@Override
	public void nextTurn() {
		// TODO Auto-generated method stub
		
	}
	
	
}

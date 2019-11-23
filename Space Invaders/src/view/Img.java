package view;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * @author gauthierbohyn
 *
 */
public class Img {
	
	//ImageIcon iconInvader, iconShip;

	ImageIcon iInvader = new ImageIcon("invader.gif");
	Image iconInvader = iInvader.getImage();
	
	ImageIcon iEnemy = new ImageIcon("gif");
	Image iconEnemy = iEnemy.getImage();
	/**
	 * @return the iconInvader
	 */
	public Image getIconInvader() {
		return iconInvader;
	}
	/**
	 * @param iconInvader the iconInvader to set
	 */
	public void setIconInvader(Image iconInvader) {
		this.iconInvader = iconInvader;
	}
	/**
	 * @return the iconEnemy
	 */
	public Image getIconEnemy() {
		return iconEnemy;
	}
	/**
	 * @param iconEnemy the iconEnemy to set
	 */
	public void setIconEnemy(Image iconEnemy) {
		this.iconEnemy = iconEnemy;
	}
	
	
}

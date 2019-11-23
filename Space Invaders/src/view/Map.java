/**
 * 
 */
package view;

/**
 * @author arnogodart
 *Classe permettant de fixer la taille du vaisseau ainsi que la taille de la carte de jeu
 */
public class Map {
	
	/**
	 * Taille de la carte (hauteur et largeur)
	 */
	public final static int MAP_HEIGHT=400;
	public final static int MAP_WIDTH=2000;
	
	/**
	 * Taille du vaisseau
	 */
	public final static int VAISSEAU_HEIGHT=40;
	public final static int VAISSEAU_WIDTH=100;
	
	/**
	 * Position dans laquelle le vaisseau commence
	 */
	public final static int VAISSEAU_START_X=500;
	public final static int VAISSEAU_START_Y=450;
	/**
	 * Bouge de 15 vers la droite ou vers la gauche
	 */
	public final static int MOVE_VAISSEAU=15;

}

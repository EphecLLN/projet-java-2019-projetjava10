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
	public final static int MAP_HEIGHT=500;
	public final static int MAP_WIDTH=1000;
	
	/**
	 * Taille du vaisseau
	 */
	public final static int VAISSEAU_HEIGHT=33;
	public final static int VAISSEAU_WIDTH=80;
	
	/**
	 * Position dans laquelle le vaisseau commence
	 */
	public final static int VAISSEAU_START_X=450;
	public final static int VAISSEAU_START_Y=400;
	/**
	 * Bouge de 15 vers la droite ou vers la gauche
	 */
	public final static int MOVE_VAISSEAU=10;

}

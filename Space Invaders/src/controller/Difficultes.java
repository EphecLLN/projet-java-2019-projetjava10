/**
 * 
 */
package controller;

/**
 * @author gauthierbohyn
 *
 */
public class Difficultes {
	
	boolean choixNormal = false;
	boolean choixDifficle = true;
	boolean vitesseNormal =false;
	boolean vitesseDifficile = false;
	public int pourcentageTirEnnemi=2;
	public static int positionStart=100;
	public static int nbrEnnemi=6;
	
	public Difficultes() {
		

		if(choixNormal==true) {
			vitesseNormal =true;
			pourcentageTirEnnemi=5;
		}

		else if(choixDifficle==true) {
			vitesseDifficile=true;
			pourcentageTirEnnemi=7;
		}
		else {
			
			
		}
	}

}

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
	public int pourcentageTirEnnemi=3;
	
	
public Difficultes() {
	

	switch(pourcentageTirEnnemi) {
	case 1:
		vitesseNormal =true;
		pourcentageTirEnnemi=5;
	break;
	
	case 2:
		vitesseDifficile=true;
		pourcentageTirEnnemi=7;
	break;
		
						}
	
			}

}

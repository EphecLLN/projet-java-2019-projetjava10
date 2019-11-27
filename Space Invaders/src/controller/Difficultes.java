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
	boolean choixDifficle = false;
	boolean vitesseNormal =false;
	boolean vitesseDifficile = false;
	public int pourcentageTirEnnemi=3;
	
	
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

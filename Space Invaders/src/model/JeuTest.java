/**
 * 
 */
package model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.Map;


/**
 * @author gauthierbohyn
 *
 */
class JeuTest {
	
	Jeu jeu = new Jeu();
/**
 * @Test getVaisseau
 *  Verifier si ce que l'on reçoit du getVaisseau est bien egale a la valeur de la variable vaisseau
 */
	
	void testSetVaisseau() {
		
		  if (jeu.vaisseau==jeu.getVaisseau()) {
				  	System.out.print("La valeur de getVaisseau est bien egale vaiseau \n");
			     }
		  		else {
		        	fail("Erreur dans getVaisseau");
		        }
		  
		
		  
	}
	/**
	 * @Test testNombre 
	 */
	
	void testNombre() {
		
		  
		  int test=3;
		  if (test==2) {
			  	System.out.print("Chiffre ok");
		     }
	  		else {
	        	fail("erreur chiffre");
	        }
		  
	}
	}



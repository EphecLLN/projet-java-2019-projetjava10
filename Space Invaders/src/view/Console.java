/**
 * 
 */
package view;

import java.awt.event.KeyEvent;

import controller.Controller;
import model.Coordonnees;
import model.Ennemi;

/**
 * @author gauthierbohyn
 *
 */
public class Console {


	
	

	static int C = Coordonnees.LONGUEURCONSOLE;
	static int L = Coordonnees.HAUTEURCONSOLE;
	static char[][] plateau = new char[C][L];
	public static void recharger(){
		
		//placer les ... dans les lignes
			
		for(int x = 0 ; x < C ; x++) {
					for(int y = 0 ; y < L ; y++) {
						plateau[x][y] = ' ';
					};
					//plateau[Ennemi.positionEnnemi][0] = '*';
					plateau[Controller.consoleX][Controller.consoleY] ='$';
				};
		//Afficher la premiere
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print('-');
		System.out.println();
		
		//Afficher les lignes dans le tableau
		for(int y = 0 ; y < L ; y++){
			System.out.print('|');
			
			for(int x = 0 ; x < C ; x++){
				System.out.print(" " + plateau[x][y] + " ");
			}
			
			System.out.print('|');
			System.out.println();
		}
		
		
		
		//afficher la derniere lignes
		for(int loop = 0 ; loop < C+2+2*C ; loop++)System.out.print('-');
		System.out.println('\n'+"Position :"+Controller.consoleX);
		}
	
		
}

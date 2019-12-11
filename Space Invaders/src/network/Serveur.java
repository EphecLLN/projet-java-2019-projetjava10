/**
 * 
 */
package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author arnog
 *
 */
public class Serveur {
	
	protected ServerSocket ss;
	protected Socket s;
	protected DataInputStream dataIn;
	protected DataOutputStream dataOut;
	

	
	// Etablir une connexion
	public void connect() throws Exception {
		try {
			ss = new ServerSocket(1040);
			System.out.println("En attente du client");
			ss.setSoTimeout(10000); // Timer permettant de fermer le socket en cas de non-connexion (après 10 secondes ici)
			s = ss.accept();
			System.out.println("Connecté");
			dataIn = new DataInputStream(s.getInputStream()); // Données entrantes
			dataOut = new DataOutputStream(s.getOutputStream()); // Données sortantes
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fermer la connexion
	public void disconnect() throws Exception {
		try {
			ss.close();
			System.out.println("Déconnecté");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur de déconnexion");
		}
	}
	
	

}

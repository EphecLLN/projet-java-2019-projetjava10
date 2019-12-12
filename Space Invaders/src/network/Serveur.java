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
	
	protected static ServerSocket ss;
	protected static Socket s;
	protected static DataInputStream dataIn;
	protected static DataOutputStream dataOut;
	protected static int port = s.getPort();
	
	

	
	// Etablir une connexion
	public void connect() throws Exception {
		try {
			ss = new ServerSocket(port);
			System.out.println("En attente du client"); // Message d'attente de connexion d'un client
			ss.setSoTimeout(10000); // Timer permettant de fermer le socket en cas de non-connexion (après 10 secondes ici)
			s = ss.accept();
			System.out.println("Connecté"); // Message de réussite de la connexion
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
	
	//Non-fonctionnel
	public static void main(String[] args) {
			Serveur server = new Serveur();
			try {
				server.connect();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	

}

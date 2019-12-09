/**
 * 
 */
package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * @author arnog
 *
 */
public class Client {
	protected Socket s;
	protected DataInputStream dataIn;
	protected DataOutputStream dataOut;
	protected String ip = "";
	
	
	// Etablir la connexion
	public void connect() throws Exception {
		try {
			s = new Socket(s.getLocalAddress(), 1040);   // On chosit le port 1040
			System.out.println("Socket créé");
			dataIn = new DataInputStream(s.getInputStream());
			dataOut = new DataOutputStream(s.getOutputStream());
			System.out.println("Connecté");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fermer la connexion
	public void disconnect() throws Exception{
		try {
			s.close();
			System.out.println("Déconnecté");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur de déconnexion");
		}
	}
	
	
	
}

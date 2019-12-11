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
			ss.setSoTimeout(10000); // Timer permettant de fermer le socket en cas de non-connexion (apr�s 10 secondes ici)
			s = ss.accept();
			System.out.println("Connect�");
			dataIn = new DataInputStream(s.getInputStream()); // Donn�es entrantes
			dataOut = new DataOutputStream(s.getOutputStream()); // Donn�es sortantes
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fermer la connexion
	public void disconnect() throws Exception {
		try {
			ss.close();
			System.out.println("D�connect�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur de d�connexion");
		}
	}
	
	

}

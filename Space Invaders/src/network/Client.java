/**
 * 
 */
package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author arnog
 *
 */
public class Client {
	protected static ServerSocket ss;
	protected static Socket s;
	protected static DataInputStream dataIn;
	protected static DataOutputStream dataOut;
	protected static int port = s.getPort();
	protected static InetAddress adresseIp = s.getInetAddress();
	
	
	// Etablir la connexion
	public void connect() throws Exception {
		try {
			s = new Socket(adresseIp, port);
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
	
	// Non - fonctionnel
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}

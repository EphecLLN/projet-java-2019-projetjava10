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
	
	protected int port;
	protected ServerSocket ss;
	protected Socket s;
	protected DataInputStream dataIn;
	protected DataOutputStream dataOut;
	
	
	
	
	public Serveur (int port) {
		this.port=port;
	}
	
	// Etablir une connexion
	public void connect() throws Exception {
		try {
			ss = new ServerSocket(port);
			s = ss.accept();
			dataIn = new DataInputStream(s.getInputStream());
			dataOut = new DataOutputStream(s.getOutputStream());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fermer la connexion
	public void disconnect() throws Exception {
		try {
			ss.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}

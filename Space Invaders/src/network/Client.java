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
	protected int port;
	protected Socket s;
	protected DataInputStream dataIn;
	protected DataOutputStream dataOut;
	protected String ip = "";
	
	
	// Etablir la connexion
	public void connect() throws Exception {
		try {
			
			s = new Socket(ip, port);
			System.out.println("Socket cr��");
			dataIn = new DataInputStream(s.getInputStream());
			dataOut = new DataOutputStream(s.getOutputStream());
			System.out.println("Connect�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Fermer la connexion
	public void disconnect() throws Exception{
		try {
			s.close();
			System.out.println("D�connect�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

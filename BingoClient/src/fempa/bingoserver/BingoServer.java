package fempa.bingoserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class BingoServer {

	public static void main(String[] args) {
		System.out.println("Iniciando el servidor..");
		
		ServerSocket server;
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		String str;
		
		try {
			server = new ServerSocket(8081);
			socket = server.accept();
			
			in = new DataInputStream(socket.getInputStream());  
			str = (String) in.readUTF();  
			System.out.println("Mensaje = " + str);  
			
			out = 
			
			
			
			dis.close();
			server.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
		
		

		
		
		

	}
	
	

}

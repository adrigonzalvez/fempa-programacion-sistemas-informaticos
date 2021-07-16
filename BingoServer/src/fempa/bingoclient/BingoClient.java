package fempa.bingoclient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BingoClient {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Socket socket;
		DataOutputStream dout;
		
		try {
			socket = new Socket("localhost", 8081);
			dout = new DataOutputStream(socket.getOutputStream());  
			dout.writeUTF(teclado.nextLine());  
			dout.flush();  
			dout.close();  
			socket.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

		teclado.close();
	}

}

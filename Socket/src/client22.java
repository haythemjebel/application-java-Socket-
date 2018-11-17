

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client22 {

	public static void main(String args[]) throws IOException {
		final String host = "localhost";
		final int portNumber = 81;
		System.out.println("Creating socket to '" + host + "' on port " + portNumber);

		while (true) {
			Socket socket = new Socket(host, portNumber);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			System.out.println("server says:" + br.readLine());

			BufferedReader userInputBR = new BufferedReader(new InputStreamReader(System.in));
			String c = userInputBR.readLine();
			int userInput = Integer.parseInt(c);
			 userInput*=2;
			
			out.println(userInput);

			System.out.println("server says:" + br.readLine());

			/*if ("0".equalsIgnoreCase(userInput)) {
				socket.close();
				break;
			}*/
		}
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class clienth {

   public static void main(String[] args) {
      
      final Socket clientSocket;
      final InputStream in;
      final OutputStream out;
      final Scanner sc = new Scanner(System.in);
  
     try {
    	 clientSocket = new Socket("localhost", 5600);
    	 out = clientSocket.getOutputStream();
    	 in = clientSocket.getInputStream();
    	 System.out.println("donner votre nombre ");
    	 int n1 = sc.nextInt();
    	 out.write(n1);
    	 
    	 int res = in.read();
    	 System.out.println("resultat =" +res);
    	 out.write(res);
    	 clientSocket.close();
		
	} catch (Exception e) {
	}

         
  }
}
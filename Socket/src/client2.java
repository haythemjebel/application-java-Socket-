import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

   public static void main(String[] args) {
      
      final Socket clientSocket;
      final InputStream in;
      final OutputStream out;
      final OutputStream out1;
      final Scanner sc = new Scanner(System.in);
      final Scanner sc2 = new Scanner(System.in);
  
     try {
    	 clientSocket = new Socket("localhost", 3320);
    	 out = clientSocket.getOutputStream();
    	 out1 = clientSocket.getOutputStream();
    	 in = clientSocket.getInputStream();
    	 System.out.println("donner votre nombre1 ");
    	 int n1 = sc.nextInt();
    	 out.write(n1);
    	 System.out.println("donner votre nombre2 ");
    	 int n2 = sc2.nextInt();
    	 out1.write(n2);
    	 int res = in.read();
    	 System.out.println("resultat =" +res);
    	 out.write(res);
    	 clientSocket.close();
		
	} catch (Exception e) {
	}

         
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serveur2 {
 
   public static void main(String[] test) {
  
     final ServerSocket serveurSocket  ;
     final Socket clientSocket ;
     final InputStream in;
     final InputStream in1;
     final OutputStream out;
  
     try {
       serveurSocket = new ServerSocket(3320);
       clientSocket = serveurSocket.accept();
       out = clientSocket.getOutputStream();
       in = clientSocket.getInputStream();
       in1 = clientSocket.getInputStream();
       int nb =  in.read();
       int nb1 = in1.read();
       int s= nb+nb1; ;
       System.out.println("envoir resp");
       out.write(s);
       clientSocket.close();
      }catch (IOException e) {
         e.printStackTrace();
      }
   }
}
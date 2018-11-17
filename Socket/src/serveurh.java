import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serveurh {
 
   public static void main(String[] test) {
  
     final ServerSocket serveurSocket  ;
     final Socket clientSocket ;
     final InputStream in;
     final OutputStream out;
     final Scanner sc=new Scanner(System.in);
  
     try {
       serveurSocket = new ServerSocket(5600);
       clientSocket = serveurSocket.accept();
       out = clientSocket.getOutputStream();
       in = clientSocket.getInputStream();
       int nb =  in.read();
       int s= nb*2 ;
       System.out.println("envoir resp");
       out.write(s);
       clientSocket.close();
      }catch (IOException e) {
         e.printStackTrace();
      }
   }
}
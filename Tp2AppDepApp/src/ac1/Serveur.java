package ac1;

import java.io.IOException;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {


	  public static void main(String[] args) {
	  try { 
	  ServerSocket ss=new ServerSocket(1446);
	  System.out.println("Je suis un serveur en attente la connexion d'un client");
	  Socket s=ss.accept();
	  InputStream is =s.getInputStream();
	  OutputStream os =s.getOutputStream();
	  System.out.println("Il attend un nombre");
	  int nb1 =is.read();
	  int nb2 =is.read();
	     System.out.println("Data received : " + nb1);
	     System.out.println("Data received : " + nb2);


         int choice =is.read();

         int rep  ;


		switch (choice) {
           case 1:
                 System.out.println("The client selected Addition operation");
                 rep = nb1 + nb2;
                 os.write(rep);
                 break;
             case 2:
                 System.out.println("The client selected Soustraction operation");
                 rep = nb1 -nb2;
                 os.write(rep);
                 break;
             case 3:
                 System.out.println("The client selected Multiplication operation");
                 rep = nb1 *nb2;
                 os.write(rep);
                 break;
             case 4:
                 System.out.println("The client selected Division operation");
                 rep = nb1 / nb2;
                 os.write(rep);
                 break;
             default:
                 System.out.println("Return to Client.");
         }

	  System.out.println("La reponse:");
	  s.close();
	  ss.close();
	  } 
	  catch(IOException e) {
		  e.printStackTrace();
		  
	  }
	  


	  }
	}

























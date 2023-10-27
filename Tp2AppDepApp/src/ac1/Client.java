package ac1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {
	

	public static void main(String[] args) {
try 
{Socket sc=new Socket ("localhost",1446);
      System.out.println("Je suis un client connecté");

      InputStream is =sc.getInputStream();

      OutputStream os =sc.getOutputStream();
  	Scanner scanner=new Scanner(System.in);
    System.out.println("Donner un nombre 1");
   int nb1=scanner.nextInt();
	os.write(nb1);
	

		 System.out.println("Donner un nombre2");
	
		   int nb2=scanner.nextInt();
			 //os.write(nb2);
			int rep;
			//System.out.println("Donner l'opérateur");
			//  int choice=scanner.nextInt();
				//os.write(choice);
			
			do{
	               System.out.println("Menu:");
	               System.out.println("1. Addition");
	               System.out.println("2. Substraction");
	               System.out.println("3. Multiplication");
	               System.out.println("4. Division");

	               System.out.print("Enter your choice: ");

	               if (scanner.hasNextInt()) {
	                   nb1 = scanner.nextInt();
	                   scanner.nextLine();
	                   if(nb1<1 || nb1>4)
	                       System.out.println("Invalid input. Please enter a number corresponding to your choice.");

	               }

	           }while(nb1<1 || nb1>4);

	           switch (nb1) {
	               case 1:
	                   System.out.println("You selected Addition operation");
	                   os.write(1);
	                   System.out.println("I'm waiting for the response from the server");
	                   rep = is.read();
	                   System.out.println("Response = "+nb1+ " +" +nb2+" = "+rep);
	                   break;
	               case 2:
	                   System.out.println("You selected Substraction operation");
	                   os.write(2);
	                   System.out.println("I'm waiting for the response from the server");
	                   rep = is.read();
	                   System.out.println("Response = "+nb1+ " -"+nb2+"  = "+rep);
	                   break;
	               case 3:
	                   System.out.println("You selected Multiplication operation");
	                   os.write(3);
	                   System.out.println("I'm waiting for the response from the server");
	                   rep = is.read();
	                   System.out.println("Response = "+nb1+ " * "+nb2+" = "+rep);
	                   break;
	               case 4:
	                   System.out.println("You selected Division operation");
	                   os.write(4);
	                   System.out.println("I'm waiting for the response from the server");
	                   rep = is.read();
	                   System.out.println("Response = "+nb1+ " / "+nb2+ "  = "+rep);
	                   break;
	               default:
	                   System.out.println("Invalid choice. Please select a valid option.");
	           }

			
	
  rep = is.read();
    System.out.println("Reponse="+rep);
      sc.close();
         }

    catch(IOException e)
{
    e.printStackTrace();	}}}
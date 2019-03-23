package socket_test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_Object {
	public static void main(String args[])
	   {  
		try
	      {  
			 Socket connection = new Socket("127.0.0.1", 8888);
			 System.out.println("Connection established:");
			 //ObjectInputStream in = null;
			 ObjectOutputStream out = null;
			 out = new ObjectOutputStream(connection.getOutputStream());
			 UserInfo userInfo = new UserInfo(1,"21","22"); 

	         System.out.println("\tSending object to server ... ");
			 out.writeObject(userInfo);	        
	         System.out.println("\tWaiting for server response ...");
         
	         //in.close();
	         out.close();
	         connection.close();
	      }
	      catch(UnknownHostException uhe)
	      {  System.err.println("Unknown host: " + args[0]); } 
	      catch(IOException ioe)
	      {  System.err.println("IOException: " + ioe); }
		
	   }

	public static String readString()
	   { String string = new String();
	     BufferedReader in=
	               new BufferedReader(new InputStreamReader(System.in));
	      try
	      {  string = in.readLine(); }
	      catch(IOException e)
	      { System.out.println("Console.readString: Unknown error...");
	        System.exit(-1);
	      }
	      return string;
	   }
}

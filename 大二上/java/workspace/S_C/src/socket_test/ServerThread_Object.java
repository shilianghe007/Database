package socket_test;

import java.io.*;
import java.net.*;

public class ServerThread_Object extends Thread{
    private Socket connection;
    public ServerThread_Object(Socket _connection) {
        connection = _connection;
        start();
    }
    public void run(){
        try{
        	ObjectInputStream   in  
                = new ObjectInputStream(connection.getInputStream());
            System.out.println("1");
            UserInfo userinfo = (UserInfo)in.readObject();
            System.out.println("2");
            //UserInfo userinfo = (UserInfo)object;
            System.out.println("3");
            System.out.println(userinfo.getIdentify());
            
            in.close();
            connection.close();
            System.out.println("Connection closed.");
        } catch(IOException ioe) {
            System.out.println("Connection closed unexpectedly.");
        }
        catch(ClassNotFoundException ex) {
        	System.out.println("error:" + ex.getMessage());
        }
    }
}

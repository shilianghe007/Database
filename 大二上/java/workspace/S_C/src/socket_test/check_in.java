package socket_test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class check_in {
	private static Connection connection = DBconnect.getConnection();
	public static int check(String account,String pswd,int identify) throws IOException
	{
		int result = -1;
		if(identify == 0)
		{
			if(account=="admin"&&pswd=="admin")
			{
				result = 0;
			}
			else {
				result = 2;
			}
		}
		if(identify == 1)
		{
			String password = null;
			Statement stmt;
			ResultSet rs;
			
			try {
				stmt = connection.createStatement();
				rs = stmt.executeQuery("SELECT * FROM team WHERE account=" + account);
				while (rs.next()) {
					password = rs.getString("password");
				}
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(pswd.equals(password)) {
				System.out.println("team succsses!");
				result = 0;
			}					
			else {
				System.out.println("team sorry!");
				if(password == null) {System.out.println("You have to register first!"); result = 1;}
				else {System.out.println("Your password is wrong");result = 2;}
			}
		}
		else if(identify == 2)
		{
			String password = null;
			Statement stmt;
			ResultSet rs;
			
			try {
				stmt = connection.createStatement();
				rs = stmt.executeQuery("SELECT * FROM referee WHERE id=" + account);
				while (rs.next()) {
					password = rs.getString("password");
				}
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(pswd.equals(password)) {
				System.out.println("referee succsses!");
				result = 0;
			}		
			else {
				System.out.println("referee sorry!");
				if(password == null) {System.out.println("You have to register first!"); result = 1;}
				else {System.out.println("Your password is wrong");result = 2;}
			}
		}
		return result;
	}
}

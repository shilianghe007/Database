package socket_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	private static final String URL="jdbc:mysql://localhost:3306/gymnastics_system?serverTimezone=UTC";
	private static final String USER="root";
	private static final String PASSWORD="160035";
 
	private static Connection conn = null;
 
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public static Connection getConnection(){
		return conn;
	}
}

package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectMySQL {
	
	/*
	 * 
	 * This method will help to connect with the MySQL database
	 * 
	 * */
	
	public static Statement connect_with_DB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium_test", "root", "Tamima15");
		Statement stm = con.createStatement();
		return stm;

	}

}

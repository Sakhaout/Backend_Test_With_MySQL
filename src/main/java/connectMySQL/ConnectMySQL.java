package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectMySQL {
	
	/*
	 * 
	 * This method will to connect with the MySQL database
	 * 
	 * */
	
	public static Statement connect_with_DB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium_test", "root", "PASSWORD");
=======
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium_test", "root", "Password");
>>>>>>> dd681bb86d8ffde87d58ca34bf22b40b9235f2db
		Statement stm = con.createStatement();
		return stm;

	}

}

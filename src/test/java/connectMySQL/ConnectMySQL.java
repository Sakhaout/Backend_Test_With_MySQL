package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded.");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium_test", "root", "Tamima15");
		System.out.println("Connect to MySQL DB.");
		Statement stm = con.createStatement();
		ResultSet rslt = stm.executeQuery("select *from selenium_user");
		
		while(rslt.next()) {
			String firstname = rslt.getString("Firstname");
			System.out.println("Firstname : "+firstname);

		}
		
	}

}

package createDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;


public class Maintains_DB {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public void insertData() throws ClassNotFoundException, SQLException {
		

	}
	
	public static void deleteData_from_DB() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the ID number that I want to DELETE: ");
		int input_id = scanner.nextInt();
		String cuery = "DELETE from selenium_user WHERE ID = " +input_id;
		ConnectMySQL.connect_with_DB().execute(cuery);
	}
	
	
	public static void see_data_from_MySQL() throws ClassNotFoundException, SQLException {

		String cuery = "select *from selenium_user";
		ResultSet rslt = ConnectMySQL.connect_with_DB().executeQuery(cuery);
		
		while(rslt.next()) {
			String firstname = rslt.getString("FIRSTNAME");
			System.out.println("Firstname : "+firstname);

		}
	}

}

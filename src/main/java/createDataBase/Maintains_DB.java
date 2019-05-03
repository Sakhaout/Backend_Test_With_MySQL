package createDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;


public class Maintains_DB {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void search_data_from_MySQL() throws ClassNotFoundException, SQLException {
		System.out.print("Please Enter SQL Query: ");
		String query = scanner.nextLine();
		System.out.print("Enter Column Name: ");
		String columnLable = scanner.next();
		ResultSet sql_data = ConnectMySQL.connect_with_DB().executeQuery(query);
		while(sql_data.next()) {
			String result_data = sql_data.getString(columnLable);
			System.out.println("Result: " +result_data);

		}
	}
	
	public static void insertData() throws ClassNotFoundException, SQLException {
		System.out.print("Enter ID: ");
		int ID = scanner.nextInt();
		System.out.print("Enter Firstname: ");
		String firstname = scanner.next();
		System.out.print("Enter Email: ");
		String email = scanner.next();

		String query = "INSERT into selenium_user(Firstname,Email,ID) value ('" +firstname +"','" +email+"','" +ID +"')";
		ConnectMySQL.connect_with_DB().executeUpdate(query);

	}
	
	public static void deleteData_from_DB() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the ID number that I want to DELETE: ");
		int input_id = scanner.nextInt();
		String query = "DELETE from selenium_user WHERE ID = " +input_id;
		ConnectMySQL.connect_with_DB().execute(query);
	}
	
	
	public static void see_data_from_MySQL() throws ClassNotFoundException, SQLException {

		
		System.out.print("What to find (firstname or email)");
		String data = scanner.next();
		String query = "select *from selenium_user";
		ResultSet rslt = ConnectMySQL.connect_with_DB().executeQuery(query);
		
		while(rslt.next()) {
			String result_data = rslt.getString(data);
			System.out.println("MySQL data : "+result_data);

		}
	}

}

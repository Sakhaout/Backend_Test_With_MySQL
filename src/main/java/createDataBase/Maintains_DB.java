package createDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;


public class Maintains_DB extends ConnectMySQL {
	
	public static Scanner scanner = new Scanner(System.in);
	
	/*
	 * This method will help to search data from MySQL database.
	 * It will ask sql query for searching data, and 
	 * column name from which cloumn thaat data will comes.
	 * sql Query for search data = select *from selenium_user
	 * */
	public static void search_data_from_MySQL() throws ClassNotFoundException, SQLException {
		System.out.print("Please Enter SQL Query: ");
		String query = scanner.nextLine();
		System.out.print("Enter Column Name: ");
		String columnLable = scanner.next();
		ResultSet sql_data = connect_with_DB().executeQuery(query);
		while(sql_data.next()) {
			String result_data = sql_data.getString(columnLable);
			System.out.println(columnLable +" : " +result_data);

		}
	}
	
	
	/*
	 * This method will help to add data into database.
	 * It will ask for user information
	 * 
	 * */
	
	public static void insertData() throws ClassNotFoundException, SQLException {

		System.out.print("Enter Firstname: ");
		String firstname = scanner.next();
		System.out.print("Enter Lastname: ");
		String lastname = scanner.next();
		System.out.print("Enter Email: ");
		String email = scanner.next();
		System.out.print("Enter Phone number: ");
		String phoneNumber = scanner.next();
//		System.out.print("Enter ID: ");
//		int ID = scanner.nextInt();

//		String query = "INSERT into selenium_user(id,Firstname,last_name,Email,Phone_Number) value ('"+ID +"','" +firstname +"','"+lastname+"','" +email+"','" +phoneNumber +"')";
		String query = "INSERT into selenium_user(Firstname,last_name,Email,Phone_Number) value ('" +firstname +"','"+lastname +"','" +email+"','" +phoneNumber +"')";

		connect_with_DB().executeUpdate(query);
		
		System.out.println("Data has been entered into DB");

	}
	
	
	/*
	 * This method will help to delete data from database
	 * It will ask for user ID to delete that data for that user ID
	 * */
	public static void deleteData_from_DB() throws ClassNotFoundException, SQLException {
		System.out.println("Enter the ID number that I want to DELETE: ");
		int input_id = scanner.nextInt();
		String query = "DELETE from selenium_user WHERE ID = " +input_id;
		connect_with_DB().execute(query);
		System.out.println("Data has been DELETED from DB");

	}
	
	
	public static void see_data_from_MySQL() throws ClassNotFoundException, SQLException {

		
		System.out.print("What to find (firstname or email)");
		String data = scanner.next();
		String query = "select *from selenium_user";
		ResultSet rslt = connect_with_DB().executeQuery(query);
		
		while(rslt.next()) {
			String result_data = rslt.getString(data);
			System.out.println(data+" : "+result_data);

		}
	}
	
	public static void add_data_in_Existing_ROW() throws ClassNotFoundException, SQLException {
		
		/*
		 * This method will help to add a data into an existing row.
		 * Query = UPDATE [table_name] set [column_name] = '[Data]' where id = 4;
		 * */
		
		System.out.print("Enter Query to add a data into an Existing Row: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("Data has been ADDED.");

		
	}

}

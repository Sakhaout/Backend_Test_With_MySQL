package createDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import connectMySQL.ConnectMySQL;


public class Maintains_DB extends ConnectMySQL {
	
	public static Scanner scanner = new Scanner(System.in);
	

	
	
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


		String query = "INSERT into selenium_user(Firstname,last_name,Email,Phone_Number) value ('" +firstname +"','"+lastname +"','" +email+"','" +phoneNumber +"')";

		connect_with_DB().executeUpdate(query);
		
		System.out.println("Data has been entered into DB");
		connect_with_DB().close();

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
		connect_with_DB().close();

	}
	
	
	/*
	 * This method will help to add a data into an existing row.
	 * Query = UPDATE [table_name] set [column_name] = '[Data]' where id = 4;
	 */
	public static void add_data_in_Existing_ROW() throws ClassNotFoundException, SQLException {
		System.out.print("Enter Query to add a data into an Existing Row: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("Data has been ADDED.");
		connect_with_DB().close();

		
	}
	
	/*
	 * For Any Type of Update, create, delete, insert,
	 * modify will be done by using this method.
	 */
	public static void ToWrite_MySQL() throws ClassNotFoundException, SQLException{

		System.out.print("Write Query to Modify SQL: ");
		String query = scanner.nextLine();
		connect_with_DB().execute(query);
		System.out.println("My SQL hasbeen executed.");
		connect_with_DB().close();

	}
	
	
	/*
	 * This method will help to search data from MySQL database.
	 * It will ask sql query for searching data, and 
	 * column name from which cloumn thaat data will comes.
	 * sql Query for search data = select *from selenium_user
	 * ==>Query = select *from selenium_user where id =2
	 */
	public static void ToRead_MySQL() throws ClassNotFoundException, SQLException {
		System.out.print("Write Query to Read SQL: ");
		String query = scanner.nextLine();
		System.out.print("Enter column name: ");
		String columnLabe = scanner.nextLine();
		ResultSet rslt = connect_with_DB().executeQuery(query);
		while(rslt.next()) {
			String result_data = rslt.getString(columnLabe);
			System.out.println(columnLabe+" => "+result_data);
		}
		connect_with_DB().close();

	}
	


}

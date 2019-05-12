package createDataBase;

import java.sql.SQLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;

public class CreateNewDB extends ConnectMySQL {
	public static Scanner scanner = new Scanner(System.in);
	

	public static void create_new_column() throws ClassNotFoundException, SQLException {
		
		/*
		 * This method will help to add a column to the existing table.
		 * It Will ask for a sql query to add a column.
		 * 
		 * ==>Query to add a column = ALTER TABLE selenium_user ADD COLUMN [column_name] [column_type] NOT NULL  FIRST/AFTER [column_name]
		 * ==>Query = ALTER TABLE selenium_user ADD COLUMN ID int(3) PRIMARY KEY AUTO_INCREMENT FIRST 
		 */
		
		System.out.print("Enter sql Query to add a column: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("New Column Has Been Created.");
	}
	

	public static void delete_existing_column() throws ClassNotFoundException, SQLException {
		
		/*This method will help to delete an existing column from the existing table
		 * 
		 * Query for delete column = ALTER TABLE selenium_user DROP phone
		 * ==>ALTER TABLE selenium_user DROP column_name
		 * 
		 * */
		
		System.out.print("Enter sql Query to delete column: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("Existing Column Has Been deleted.");
	}
	/*
	 * This method will help to organize column in a table.
	 * */
	@Test
	public static void rearrange_MySQL_column() throws ClassNotFoundException, SQLException {
		String query = "ALTER TABLE selenium_user CHANGE COLUMN  ID int(3) FIRST Firstname";
		connect_with_DB().executeUpdate(query);
		System.out.println("Existing Column Has Been relocated.");

		
	}
	

}

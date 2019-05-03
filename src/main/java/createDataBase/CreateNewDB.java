package createDataBase;

import java.sql.SQLException;
import java.util.Scanner;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;

public class CreateNewDB extends ConnectMySQL {
	public static Scanner scanner = new Scanner(System.in);
	

	public static void create_new_column() throws ClassNotFoundException, SQLException {
		
		/*Query to add a column = ALTER TABLE selenium_user ADD COLUMN Phone_Number VARCHAR(15) NOT NULL AFTER email*/
		
		System.out.print("Enter sql Query to add a column: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("New Column Has Been Created.");
	}
	

	public static void delete_existing_column() throws ClassNotFoundException, SQLException {
		
		/*Query for delete column = "ALTER TABLE selenium_user DROP phone";*/
		
		System.out.print("Enter sql Query to delete column: ");
		String query = scanner.nextLine();
		connect_with_DB().executeUpdate(query);
		System.out.println("Existing Column Has Been deleted.");
	}

}

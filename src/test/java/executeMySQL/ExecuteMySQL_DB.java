package executeMySQL;

import java.sql.SQLException;
import java.util.Scanner;

import createDataBase.CreateNewDB;
import createDataBase.Maintains_DB;

public class ExecuteMySQL_DB {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.print("Enter Your choise: ");
		int caseNumber = scanner.nextInt();
		
		switch(caseNumber) {
		case 1:
			CreateNewDB.create_new_column();
			break;
			
		case 2:
			CreateNewDB.delete_existing_column();
			break;
			
		case 3:
			Maintains_DB.deleteData_from_DB(); //Delete data from MySQL DB
			break;
			
		case 4:
			Maintains_DB.insertData(); // To Add data into database
			break;
			
		case 5:
			Maintains_DB.see_data_from_MySQL(); //See Data from DB
			break;
			
		case 6:
			Maintains_DB.search_data_from_MySQL();
			break;
			
		}
	}

}

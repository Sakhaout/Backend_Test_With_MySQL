package executeMySQL;

import java.sql.SQLException;
import java.util.Scanner;

import connectMySQL.ConnectMySQL;
import createDataBase.CreateNewDB;
import createDataBase.Maintains_DB;

public class ExecuteMySQL_DB extends ConnectMySQL {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.print("Enter Your choise: ");
		int caseNumber = scanner.nextInt();
		String restart;
		do {
			try {

				switch(caseNumber) {

				case 1:
					CreateNewDB.create_new_column();
					break;

				case 2:
					CreateNewDB.delete_existing_column();
					break;

				case 3:
					/*
					 * Delete data from MySQL DB
					 */
					Maintains_DB.deleteData_from_DB(); 
					break;

				case 4:
					/*
					 * To Add data into database
					 */
					Maintains_DB.insertData(); 
					break;

				case 5:
					/*
					 * Read A single data or set of data from MySQL
					 * is done by using this method.
					 */
					Maintains_DB.ToRead_MySQL(); //See Data from DB
					break;

				case 6:
					/*
					 * For Any Type of Update, create, delete, insert,
					 * modify will be done by using this method.
					 */
					Maintains_DB.ToWrite_MySQL();
					break;

				case 7:
					Maintains_DB.add_data_in_Existing_ROW();

					
				}
			}
			catch(Exception ex) {
				ex.getMessage();
			}




			System.out.print("Enter Y to run it again or Enter anything to exit__");
			restart = scanner.next();
		}while(restart.equalsIgnoreCase("y"));
	}

}

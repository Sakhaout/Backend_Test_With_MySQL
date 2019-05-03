package executeMySQL;

import java.sql.SQLException;

import createDataBase.Maintains_DB;

public class ExecuteMySQL_DB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Maintains_DB.deleteData_from_DB(); //Delete data from MySQL DB
		Maintains_DB.see_data_from_MySQL(); //See Data from DB

	}

}

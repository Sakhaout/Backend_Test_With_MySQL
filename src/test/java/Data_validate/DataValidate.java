package Data_validate;

import static org.testng.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import connectMySQL.ConnectMySQL;
import createDataBase.Maintains_DB;

public class DataValidate extends ConnectMySQL {
	
	@Test
	public static void email_validate_with_MySQL() throws ClassNotFoundException, SQLException {
		
		String SQL_Query = "select *from selenium_user where id =2";
		String column_name = "email";
		ResultSet sql_data = connect_with_DB().executeQuery(SQL_Query);
		sql_data.next();
		String result_data = sql_data.getString(column_name);
		assertEquals("tamanna@gmail.com", result_data);
		sql_data.close();

	}

}

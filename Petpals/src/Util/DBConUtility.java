package Util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConUtility {
	public static Connection getConnection() {
		Connection conn=null;
		 try {
			 String connectionString=PropertyDB.getConnectionString();
			 conn=DriverManager.getConnection(connectionString);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return conn;
	}


}

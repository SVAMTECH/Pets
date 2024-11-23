package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConUtility {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Get connection string, username, and password from PropertyDB
            String connectionString = PropertyDB.getConnectionString();
            String username = PropertyDB.getUsername();
            String password = PropertyDB.getPassword();

            if (connectionString == null || username == null || password == null) {
                throw new IllegalStateException("Missing database configuration");
            }

            // Establish connection using DriverManager
            conn = DriverManager.getConnection(connectionString, username, password);

            System.out.println("Database connection established successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

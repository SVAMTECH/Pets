package Util;

import java.io.FileReader;
import java.util.Properties;

public class PropertyDB {
    public static String getConnectionString() {
        String connectionString = null;
        try (FileReader re = new FileReader("db.properties")) {
            Properties p = new Properties();
            p.load(re);

            // Read the URL property directly
            connectionString = p.getProperty("url");

            // Log or debug to ensure the values are being read correctly
            System.out.println("Database URL: " + connectionString);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectionString;
    }

    public static String getUsername() {
        try (FileReader re = new FileReader("db.properties")) {
            Properties p = new Properties();
            p.load(re);
            return p.getProperty("username");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getPassword() {
        try (FileReader re = new FileReader("db.properties")) {
            Properties p = new Properties();
            p.load(re);
            return p.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

package app.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    public static Connection getConnection() throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver"); 
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/inventory",
            "root",
            "zxcv"
        );
    }
}

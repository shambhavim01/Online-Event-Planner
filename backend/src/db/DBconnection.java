package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306//EventManagementDatabase";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Rutik@512";

    private Connection connection;

    // Constructor to establish a database connection
    public DBconnection() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the database connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database");
        }
    }

    // Close the database connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DBconnection db = new DBconnection();
        db.closeConnection();
    }
}

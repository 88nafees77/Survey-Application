package database;

import StudentManagementData.JdbcUrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    public static Connection getCon() throws SQLException {
        try {
            Class.forName(JdbcUrl.driver);
        } catch (ClassNotFoundException e) {
        }

        Connection connection= DriverManager.getConnection(JdbcUrl.url,JdbcUrl.username,JdbcUrl.password);
        return connection;
    }
}

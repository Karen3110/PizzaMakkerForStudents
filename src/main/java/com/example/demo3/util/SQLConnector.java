package com.example.demo3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {

    private static final String user = "root";
    private static final String password = "1234567890";
    private static final String DB = "pizzaMakerService";
    private static final String url = "jdbc:mysql://localhost:3306/" + DB;

    private static Connection connection = null;

    private SQLConnector() {
    }


    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, password);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return connection;
    }


}

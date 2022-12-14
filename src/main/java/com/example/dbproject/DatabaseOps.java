package com.example.dbproject;

import java.sql.Connection;
import java.sql.*;

public class DatabaseOps {

    private static Connection connection;
    private final String TABLE_NAME = "";

    public void createConnection() {
        String databaseURL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD"; //for remote connection
        String username = "";
        String password = "";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Object connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Database connection successfully established.");

        } catch (ClassNotFoundException cnfe) {
            System.out.println("Cannot establish connection with database : " + cnfe);
        } catch (SQLException sqle) {
            System.out.println("Cannot establish connection with database : " + sqle);
        }
    }

    public String showEmployeeRecord(String fname, String lname) {
        String query = "SELECT EMAIL FROM " + TABLE_NAME +"WHERE lname = " + lname + " AND fname = " + fname;

        float total = 0f;
        try {
            if (!connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

                String output = "";
                int columnCount = resultSetMetaData.getColumnCount();

                while (resultSet.next()) {
                    output = "";

                    for (int col = 1; col <= columnCount; col++) {


                    }
                    //System.out.println(output);
                }
                if (!statement.isClosed()) {
                    statement.close();
                }
            } else {
                System.out.println("Cannot show statement as the connection is closed.");
            }
        } catch (SQLException sqle) {
            System.out.println("Cannot retrieve records from the database : " + sqle);
        }

        return query;
    }
}

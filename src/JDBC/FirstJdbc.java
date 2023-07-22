package JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class FirstJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";

        String username = "root";
        String password = "";
        try {
            //loading the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //setting up the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            //creation of statement
            Statement statement = connection.createStatement();

            //query
            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
 * Working of jdbc:
 * Driver class lai load garne
 * Connection build
 * Creation of statement
 * Writing up the query
 *
 */

// To change the indent for the file explorer in VS Code, you can go to File >
// Preference > Settings and choose Workbench › Tree: Indent. You can also enter
// this directly in your settings.json: "workbench.tree.indent": 101. Another
// way to change the indent is to right-click your document and select FORMAT
// DOCUMENT WITH, then select CONFIGURE DEFAULT FORMATTER, and select C/C++1. By
// default, each new level of tree is indented by 8px1.

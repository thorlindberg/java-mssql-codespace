package com.thorlindberg.sample;
import java.sql.*;

public class Main {
  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      // Step 1: Load the JDBC driver.
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

      // Step 2: Establish the connection to the database.
      String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;user=MyUserName;password=MyPassword";
      conn = DriverManager.getConnection(url);

      // Step 3: Create a statement object.
      stmt = conn.createStatement();

      // Step 4: Execute a SQL query.
      String sql = "SELECT * FROM Person.Person";
      ResultSet rs = stmt.executeQuery(sql);

      // Step 5: Process the result set.
      while (rs.next()) {
        int id = rs.getInt("BusinessEntityID");
        String name = rs.getString("FirstName");
        System.out.println("ID: " + id + ", Name: " + name);
      }
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      // Step 6: Close the resources.
      try {
        if (stmt != null) stmt.close();
      } catch (SQLException se2) {
      }
      try {
        if (conn != null) conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
  }
}
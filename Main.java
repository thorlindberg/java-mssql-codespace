import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            // Step 1: Load the JDBC driver.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Step 2: Establish the connection to the database.
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TestDB", "user", "password");

            // Step 3: Create a statement object.
            statement = connection.createStatement();

            // Step 4: Execute the SQL statement.
            statement.executeUpdate("CREATE TABLE Employees (ID INT PRIMARY KEY, Name VARCHAR(255), Age INT)");
            statement.executeUpdate("INSERT INTO Employees (ID, Name, Age) VALUES (1, 'John', 30)");
            statement.executeUpdate("INSERT INTO Employees (ID, Name, Age) VALUES (2, 'Jane', 35)");
            statement.executeUpdate("INSERT INTO Employees (ID, Name, Age) VALUES (3, 'Bill', 40)");

            // Step 5: Close the statement and connection objects.
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
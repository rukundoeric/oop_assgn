import java.sql.*;
public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:invalid:url", "root", "password");
        } catch (SQLException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
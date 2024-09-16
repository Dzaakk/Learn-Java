package dzaakk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectionTest {
    @Test
    void testConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/java_todolist";
        String username = "";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Success Connect to Database");
            connection.close(); // don't forget to close connection
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}

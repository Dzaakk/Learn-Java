package dzaakk;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

public class SqlInjectionTest {

    @Test
    void testSqlInjection() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String username = ""; // if user add this " '; #" user can do sql injection
        String password = "";

        String sql = "Select * FROM admin WHERE username = '" + username + "' AND password = '" + password + "'";

        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("login success");
        } else {
            System.out.println("login failed");
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}

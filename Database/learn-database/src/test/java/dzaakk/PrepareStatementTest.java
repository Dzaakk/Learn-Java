package dzaakk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class PrepareStatementTest {
    @Test
    void testPrepareStatement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        // String username = "'; #";
        String username = "";
        String password = "";

        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("login success");
        } else {
            System.out.println("login failed");
        }

        preparedStatement.close();
        connection.close();
    }
}

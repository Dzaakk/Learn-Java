package dzaakk;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mysql.cj.jdbc.Driver;

public class DriverTest {
    @Test
    void testRegister() {
        try {
            Driver mysqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqlDriver);
        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}

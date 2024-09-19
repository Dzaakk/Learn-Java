package dzaakk;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        var pattern = "Hi {0}!";
        var messageFormat = new MessageFormat(pattern);

        var format = messageFormat.format(new Object[] {
                "Agent A",
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        var locale = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("greeting.message");

        var messageFormat = new MessageFormat(pattern);
        var format = messageFormat.format(new Object[] {
                "Agent A",
        });

        System.out.println(format);
    }
}

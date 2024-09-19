package dzaakk;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ChoiceFormatTest {
    @Test
    void testChoiceFormat() {
        var pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        var choiceFormat = new ChoiceFormat(pattern);

        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(2));
    }

    @Test
    void testChoiceFormatInMessageFormat() {
        var locale = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", locale);

        var pattern = resourceBundle.getString("balance");

        var messageFormat = new MessageFormat(pattern, locale);

        System.out.println(messageFormat.format(new Object[] { -10000000 }));
        System.out.println(messageFormat.format(new Object[] { 0 }));
        System.out.println(messageFormat.format(new Object[] { 10000000 }));
    }
}

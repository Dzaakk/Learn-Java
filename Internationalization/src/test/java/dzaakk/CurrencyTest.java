package dzaakk;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CurrencyTest {
    @Test
    void testCurrency() {
        var indonesia = new Locale("in", "ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        var america = new Locale("en", "US");
        var currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testNumberFormatCurrency() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        var format = numberFormat.format(10000000.333);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParse() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            var parse = numberFormat.parse("Rp900.750,76").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}

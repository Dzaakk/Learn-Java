package dzaakk.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import dzaakk.test.generator.SimpleDisplayNameGenerator;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test for Calculator")
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    // @DisplayName("Test success add condition")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    // @DisplayName("Test success divide condition")
    public void testDivideSucces() {
        var result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    // @DisplayName("Test error divide condition")
    public void testDivideError() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}

package dzaakk.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import dzaakk.test.generator.SimpleDisplayNameGenerator;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test for Calculator")
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all"); // execute just once before all unti test
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all"); // execute just once after all unit test
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each"); // execute multiple times before every unit test
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each"); // execute multiple times after every unit test
    }

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

    @Test
    @Disabled
    public void testComingSoon() {

    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("Test Aborted");
        }
    }
}

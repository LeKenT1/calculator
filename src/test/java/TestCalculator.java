import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.addition(2, 2));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtraction(4, 2));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiplication(4, 2));
        assertEquals(0, calculator.multiplication(0, 10));
        assertEquals(-15, calculator.multiplication(3, -5));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(4, 2));
        assertEquals(5, calculator.division(25, 5));
    }

}

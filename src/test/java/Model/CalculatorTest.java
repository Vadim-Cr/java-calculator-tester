package Model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();
    @org.junit.jupiter.api.Test
    void add() {
        assertEquals( 3.0, calculator.add(2, 1));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals( 9.0, calculator.subtract(30, 21));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(9.0, calculator.multiply(3, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals( 21.0, calculator.divide(42, 2));
    }
}
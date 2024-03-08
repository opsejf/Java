import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    @Test
    @DisplayName(("Add 3 numbers"))
    void add() {
        assertEquals(6, Calculator.add(1, 2, 3));

    }

    @Test
    @DisplayName(("Multiply 3 numbers"))
    void multiply() {
        assertAll(() -> assertEquals(8, Calculator.multiply(2, 2, 2)),
                () -> assertEquals(-8, Calculator.multiply(2, -2, 2)),
                () -> assertEquals(-8, Calculator.multiply(-2, -2, -2)),
                () -> assertEquals(6, Calculator.multiply(3, 2, 1)),
                () -> assertEquals(0, Calculator.multiply(2, 1, 0)));

    }
}
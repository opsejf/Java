import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest3 {
    private double[] numbersForTest1 = new double[5];
    private double[] numbersForTest2 = {5, -4, 3, -2, -2};
    private double[] numbersForTest3 = new double[5];
    private double[] numbersForTest4 = {1, 4, 3, 2, 1};
    private double[] numbersForTest5 = {1, 4, 0, 2, 1};
    @BeforeEach
    void setUp() {
        for(int i = 0; i < 5; i++){
            numbersForTest1[i] = i + 1;
            numbersForTest3[i] = -(i + 1);
        }
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Add 5 numbers")
    @Test
    void add() {
        assertEquals(6, Calculator.add(1, 2, 3));
    }

    @DisplayName("Multiply 5 numbers")
    @Test
    void multiply() {
        assertAll(() -> assertEquals(120, Calculator.multiply(numbersForTest1)),
                () -> assertEquals(-240, Calculator.multiply(numbersForTest2)),
                () -> assertEquals(-120, Calculator.multiply(numbersForTest3)),
                () -> assertEquals(24, Calculator.multiply(numbersForTest4)),
                () -> assertEquals(0, Calculator.multiply(numbersForTest5)));
    }
}
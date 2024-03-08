import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.qa.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();


    @Test
    @DisplayName("All secrets pass.")
    void secrets(){

        assertTrue( calculator.secretNumber() == 1234, "'secretNumber()' does not return as expected.");
        assertTrue(calculator.secretKey() == "XYZ789", "'secretKey()'  does not return as expected.");
    }


    @Test
    @DisplayName("Basic calculations")
    void calculations(){



        for(int i=0; i<100; i++){
            int x=i;
            int y=i;
            int calculation = calculator.addNumbers(x,y);
            int compare = i + i;
            String details = "Cycle: " + i + ", Parameters: " + x + ", " + y;

            assertFalse( calculation > compare, "Returned number ("+calculation+") was too high; should be ("+compare+")." + details);
            assertFalse( calculation < compare, "Returned number ("+calculation+") was too low; should be ("+compare+")." + details);
        }
//        assertTrue( calculator.addNumbers(1,1) == 2, "Numbers did not add correctly." );

    }
}

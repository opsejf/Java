import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    @DisplayName("Comparison of Numbers.")
    void firstExample(){
        assertEquals(1,1);

        assertTrue(1 < 2, "This works...");

        assertTrue(3 < 2, "This fails...");

    }


//    @Test
//    @DisplayName("Animal Functionality.")
//    void ActionTest(){
//        Animal
//    }
}

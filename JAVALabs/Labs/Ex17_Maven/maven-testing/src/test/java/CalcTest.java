import org.junit.Assert;
import org.junit.Test;

public class CalcTest {


    @Test
    public void testAdd() {
        Assert.assertEquals(2, Calc.add(1, 1));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(5, Calc.subtract(15, 10));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(3.33333, Calc.divide(10, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(20, Calc.multiply(4, 5));
    }
}

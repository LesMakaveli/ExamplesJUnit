import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest
{
    private final double EPS = 1e-9;
    private Calculator calculator;

    @Before
    public void setTwoNumbers() {
        calculator = new Calculator(1,0);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionDivision() {
        calculator.divide();
    }

    @Test
    public void expectedResulTwo() {
        Assert.assertEquals(1, calculator.add(), EPS);
    }
}

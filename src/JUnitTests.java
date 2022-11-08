import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTests {
    private double x;
    private double y;

    @Before
    public void setUp()
    {
        x = 10;
        y = 21;
    }

    @Test
    public void testAdd()
    {
        int expectedResult = 31;
        Addition addition = new Addition(x, y);
        addition.doOperate();
        Assert.assertEquals(expectedResult, addition.answer, 0);
    }

    @Test
    public void testSubstraction()
    {
        int expectedResult = -11;
        Subtraction subtraction = new Subtraction(x, y);
        subtraction.doOperate();
        Assert.assertEquals(expectedResult, subtraction.answer, 0);
    }

    @Test
    public void testOutOfRange()
    {
        boolean expected = false;
        boolean actual = false;
        if (x > Double.MAX_VALUE || x < Double.MIN_VALUE)
            actual = true;

        Assert.assertEquals(expected, actual);
    }
}
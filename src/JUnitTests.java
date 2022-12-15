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
        Addition addition = new Addition();
        addition.setFirstItem(x);
        addition.setSecondItem(y);

        addition.doOperate();
        Assert.assertEquals(expectedResult, addition.answer, 0);
    }

    @Test
    public void testSubstraction()
    {
        int expectedResult = -11;
        Subtraction subtraction = new Subtraction();
        subtraction.setFirstItem(x);
        subtraction.setSecondItem(y);
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

    @Test
    public void testMultiplication(){
        int expectedResult = 210;
        Multiplication multiplication = new Multiplication();
        multiplication.setFirstItem(x);
        multiplication.setSecondItem(y);
        multiplication.doOperate();
        Assert.assertEquals(expectedResult, multiplication.answer, 0);
    }

    @Test
    public void testDivision(){
        double expectedResult = 0.47619047619047616;
        Division division = new Division();
        division.setFirstItem(x);
        division.setSecondItem(y);
        division.doOperate();
        Assert.assertEquals(expectedResult, division.answer, 0);
    }

    @Test
    public void testSin(){
        double expectedResult = -0.5440211108893698;
        Sin sin = new Sin();
        sin.setFirstItem(x);
        sin.doOperate();
        Assert.assertEquals(expectedResult, sin.answer, 0.001);
    }

    @Test
    public void testCos(){
        double expectedResult = -0.5477292602242684;
        Cos cos = new Cos();
        cos.setFirstItem(y);
        cos.doOperate();
        Assert.assertEquals(expectedResult, cos.answer, 0.001);
    }
}
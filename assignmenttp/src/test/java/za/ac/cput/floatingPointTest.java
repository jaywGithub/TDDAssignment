package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class floatingPointTest {

    @Test
    public void testFloatNum()throws Exception
    {
        float num1 = 1;
        float num2 = 1;

        float expected = 2;
        float result = floatingPoint.floatNum(num1, num2);

        Assert.assertEquals(expected, result, 0.00);
    }
}

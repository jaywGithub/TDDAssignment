package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testFailTest {
    @Test
    public void addValues() throws Exception
    {
        int num1 = 3;
        int num2 = 1;

        int expected = 2;
        int result = failTest.addition(num1, num2);

        Assert.assertEquals(expected, result, 0);
    }
}

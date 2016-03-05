package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class IntegersTest {

    @Test
    public void testInt()throws Exception
    {
        int num1 = 1;
        int num2 = 1;

        int expected = 2;
        int result = Integers.intNum(num1, num2);

        Assert.assertEquals(expected, result, 00000);
    }
}

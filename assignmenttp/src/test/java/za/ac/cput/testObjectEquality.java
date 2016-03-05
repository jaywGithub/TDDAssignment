package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class testObjectEquality {

    @Test
    public void testEquality() throws Exception
    {
        int num1 = 2;
        int num2 = 3;

        Integer expected = new Integer(5);
        Integer result = new Integer(objectEquality.sum(num1, num2));

        Assert.assertEquals(expected, result);
    }
}

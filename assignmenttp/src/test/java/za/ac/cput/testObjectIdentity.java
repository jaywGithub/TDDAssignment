package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testObjectIdentity {

    @Test
    public void testIdentity()throws Exception
    {
        int num1 = 4;
        int num2 = 3;

        //Integer num1 = new Integer(3);
        //Integer num2 = new Integer(4);

        Integer expected = new Integer(0);
        Integer result = new Integer(objectIdentity.subtract(num1, num2));

        Assert.assertSame(expected, expected);
    }
}

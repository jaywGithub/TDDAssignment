package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testNullness {

    @Test
    public void nameValue() throws Exception
    {
        //String name = null;

        String expected = null;
        String result = nullness.personName(null);

        Assert.assertNull(expected, result);
    }
}

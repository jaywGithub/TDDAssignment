package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testHouseValue {
    @Test
    public void testValue()throws Exception
    {
        int expected = 500000;
        //int result = houseValue.value(400000);
        int result = houseValue.value(500000);

        Assert.assertEquals(expected, result);
    }
}

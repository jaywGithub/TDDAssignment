package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testCarKilometers {
    @Test
    public void testKilometers()throws Exception
    {
        int expected = 50000;
        //int result = carKilometers.kilometers(75000);
        int result = carKilometers.kilometers(50000);

        Assert.assertEquals(expected, result);
    }
}

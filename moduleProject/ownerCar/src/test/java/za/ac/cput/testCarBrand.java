package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testCarBrand {
    @Test
    public void testCarBrand()throws Exception
    {
        String expected = "Toyota";
        //String result = carBrand.brand("Mercedes");
        String result = carBrand.brand("Toyota");

        Assert.assertSame(expected, result);
    }
}

package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testHouseCity {
    @Test
    public void testCity()throws Exception
    {
        String expected = "Cape Town";
        //String result = houseCity.city("Cape Town");
        String result = houseCity.city("Durban ");

        Assert.assertNotSame(expected, result);
    }
}

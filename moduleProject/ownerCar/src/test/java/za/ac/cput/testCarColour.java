package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testCarColour {
    @Test
    public void testColour()throws Exception
    {
        String expected = "Blue";
        //String result = carColour.colour("Blue");
        String result = carColour.colour("Red");

        Assert.assertNotSame(expected, result);
    }
}

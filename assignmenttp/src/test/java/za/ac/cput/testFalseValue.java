package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testFalseValue {
    @Test
    public void testAppleColour() throws Exception
    {
        String appleA = "red";

        boolean expected = true;
        boolean result = false;


        if(appleA == "green")
            result = true;
        else
            result = false;

        Assert.assertFalse(appleA, result);


    }
}
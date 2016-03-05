package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testTruth {
    @Test
    public void testColour() throws Exception
    {
        String appleA = "green";
        //String appleB = "red";

        boolean expected = true;
        boolean result = false;

        result = truth.appleColour("red");

        if(appleA == "green")
            result = true;
        else
            result = false;

        Assert.assertTrue(appleA, result);


    }
}

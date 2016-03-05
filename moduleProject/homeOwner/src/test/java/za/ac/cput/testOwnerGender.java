package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testOwnerGender {
    @Test
    public void testGender()throws Exception
    {
        String expected = "m";
        //String result = ownerGender.gender("f");
        String result = ownerGender.gender("m");

        boolean choice;

        if(result == "f")
            choice = false;
        else
            choice = true;

        Assert.assertTrue(expected, choice);
    }
}

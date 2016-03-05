package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testPetGroup {
    @Test
    public void testGroup()throws Exception
    {
        String expected = "Dog";
        //String result = petGroup.group(null);
        String result = petGroup.group("Dog");

        Assert.assertNotNull(expected, result);
    }
}

package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testPetName {
    @Test
    public void testName()throws Exception
    {
        String expected = "Fluffy";
        //String result = petName.name("Snoopy");
        String result = petName.name("Fluffy");

        Assert.assertEquals(expected, result);

    }
}

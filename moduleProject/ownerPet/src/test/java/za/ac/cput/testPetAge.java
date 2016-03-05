package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testPetAge {
    @Test
    public void testAge()throws Exception
    {
        int expected = 10;
        //int result = petAge.age(4);
        int result = petAge.age(10);

        Assert.assertEquals(expected, result);

    }
}

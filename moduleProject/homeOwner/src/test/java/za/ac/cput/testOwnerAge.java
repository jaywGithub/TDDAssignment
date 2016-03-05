package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testOwnerAge {
    @Test
    public void testOwnerAge()throws Exception
    {
        int expected = 50;
        //int result = ownerAge.age(30);
        int result = ownerAge.age(50);

        Assert.assertEquals(expected, result);
    }
}

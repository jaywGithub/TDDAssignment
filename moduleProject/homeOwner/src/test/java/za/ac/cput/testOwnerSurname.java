package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testOwnerSurname {
    @Test
    public void testSurname() throws Exception
    {
        String expected = "Peters";
        //String result = ownerSurname.surname("Pet");
        String result = ownerSurname.surname("Peters");

        Assert.assertEquals(expected, result);
    }
}

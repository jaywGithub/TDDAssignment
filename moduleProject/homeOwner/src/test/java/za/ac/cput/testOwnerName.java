package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testOwnerName {

    @Test
    public void checkName() throws Exception {

        String expected = "Jayson";
        //String result = null;
        String result = ownerName.name("Jayson");

        Assert.assertNotNull(expected, result);
    }
}

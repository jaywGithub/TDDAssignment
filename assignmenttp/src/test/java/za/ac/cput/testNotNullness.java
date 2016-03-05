package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testNotNullness {

    @Test
    public void surnameValue() throws Exception
    {
        String expected = "Peters";
        String result = notNullness.personSurname("Peters");

        Assert.assertNotNull(expected, result);
    }
}

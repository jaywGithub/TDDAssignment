package za.ac.cput;

import junit.framework.Assert;
import org.junit.Ignore;


/**
 * Created by JAYSON on 2016-03-03.
 */

public class testDisabledTest {

    @Ignore
    public void checkSongName()throws Exception
    {
        String expected = "Diamonds";
        String result = disabledTest.musicNames("Diamonds");

        Assert.assertEquals(expected, result, "");
    }
}

package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testHousePainted {
    @Test
    public void testPainted()throws Exception
    {
        char result = housePainted.painted('Y');
        //char result = housePainted.painted('N');

        boolean answer = false;

        if(result == 'N')
            answer = false;
        else if(result == 'Y')
            answer = true;

        Assert.assertTrue(answer);

    }
}

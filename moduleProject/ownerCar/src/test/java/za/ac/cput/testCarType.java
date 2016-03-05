package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testCarType {
    @Test
    public void testType()throws Exception
    {
        //S = Sedan
        //V = SUV

        char expected = 'S';
        //char result = carType.type('S');
        char result = carType.type('S');

        boolean choice = false;

        if(result == 'V')
            choice = false;
        else if(result == 'S')
            choice = true;

        Assert.assertTrue(choice);
    }
}

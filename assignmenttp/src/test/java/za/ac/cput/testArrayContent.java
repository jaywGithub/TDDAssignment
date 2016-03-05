package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testArrayContent {
    @Test
    public void checkArray()throws  Exception
    {
        String [] expected = {"a", "b", "c", "d"};
        String [] fruitNames = {"a", "b", "c", "d"};
        String [] nothing = {};
        //String[] result = arrayContent.list(nothing);


        Assert.assertArrayEquals(expected, fruitNames);
    }
}

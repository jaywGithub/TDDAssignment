package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testHouseRooms {
    @Test
    public void testRooms()throws Exception
    {
        int expected = 7;
        //int result = houseRooms.rooms(4);
        int result = houseRooms.rooms(7);

        Assert.assertEquals(expected, result);
    }
}

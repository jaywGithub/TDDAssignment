package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class testPetGender {
    @Test
    public void testGender()throws Exception
    {
        char result = petGender.gender('M');
        boolean sex = false;

        if(result == 'M')
            sex = false;
        else if(result == 'F')
            sex = true;

        Assert.assertFalse(sex);
    }
}

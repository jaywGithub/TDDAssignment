package za.ac.cput;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeoutException;

/**
 * Created by JAYSON on 2016-03-03.
 */
public class testTimeout {

    @Rule
    public Timeout globalTimeout = new Timeout(11);

    @Test
    public void oversleepTime() throws Exception
    {
        Thread.sleep(10);
        //Thread.sleep(12);
    }
}
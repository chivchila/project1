package helloWorld;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chivchila on 15/04/2016.
 */
public class HelloWorldTest {
    public HelloWorld hw = new HelloWorld();
    @Test
    public void testReturnTwo() throws Exception {
        Assert.assertEquals(hw.returnTwo(), 2);
    }

    @Test
    public void testReturnThree() throws Exception {
        Assert.assertEquals(hw.returnThree(), 3);
    }

}
package edu.lmu.cs.mike;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.AdditionDoubler;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shahar on 11/8/2016.
 */
@Test(groups="UnitTest")
public class AdditionDoublerTest {

    @Test
    public void additionDoubler() {
        IntegerDoubler doubler = new AdditionDoubler();

        Assert.assertEquals(doubler.doDouble(5), 10);
        Assert.assertEquals(doubler.doDouble(10), 20);
    }
}

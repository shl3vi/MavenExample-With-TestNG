package edu.lmu.cs.mike;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.BitShiftDoubler;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups="Integration")
public class BitShiftDoublerTest {

  @Test
  public void bitshiftDoubler() {
    IntegerDoubler doubler = new BitShiftDoubler();

    Assert.assertEquals(doubler.doDouble(5), 0);
    Assert.assertEquals(doubler.doDouble(10), 0);
  }
}

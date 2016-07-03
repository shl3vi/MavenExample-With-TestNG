package edu.lmu.cs.mike;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.AdditionDoubler;
import edu.lmu.cs.mike.impl.BitShiftDoubler;
import edu.lmu.cs.mike.impl.MultiplicationDoubler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDoubler {
  @Test
  public void additionDoubler() {
    IntegerDoubler doubler = new AdditionDoubler();

    Assert.assertEquals(doubler.doDouble(5), 10);
    Assert.assertEquals(doubler.doDouble(10), 20);
  }

  @Test
  public void multiplicationDoubler() {
    IntegerDoubler doubler = new MultiplicationDoubler();

    Assert.assertEquals(doubler.doDouble(5), 10);
    Assert.assertEquals(doubler.doDouble(10), 20);
  }

  @Test
  public void bitshiftDoubler() {
    IntegerDoubler doubler = new BitShiftDoubler();

    Assert.assertEquals(doubler.doDouble(5), 0);
    Assert.assertEquals(doubler.doDouble(10), 0);
  }
}

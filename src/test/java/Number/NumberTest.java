package Number;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NumberTest {
   public void sum () throws Exception {
       Number number = new Number();
       int actual = number.num(5);
       int expected = 15;
       Assert.assertEquals(expected, actual);
    }
}
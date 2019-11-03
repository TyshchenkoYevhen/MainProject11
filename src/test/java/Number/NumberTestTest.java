package Number;

import org.junit.Assert;
import org.junit.Test;

public class NumberTestTest {

    @Test
    public void sum () throws Exception {
            Number number = new Number();
            int actual = number.num(5);
            int expected = 15;
            Assert.assertEquals(expected, actual);
        }
    }

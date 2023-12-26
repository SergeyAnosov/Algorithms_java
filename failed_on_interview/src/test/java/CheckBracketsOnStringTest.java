import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBracketsOnStringTest {


    @Test
    public void checkString_whenCorrectString() {
        String correctString = "s(dhgj_sfbfj)";
        CheckBracketsOnString ch = new CheckBracketsOnString();

        assertTrue(ch.checkString(correctString));
    }

    @Test
    public void checkString_whenWrongString() {
        String correctString = "s)dhgj_)sfbfj)";
        CheckBracketsOnString ch = new CheckBracketsOnString();

        assertFalse(ch.checkString(correctString));
    }
}
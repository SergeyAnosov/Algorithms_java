import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBracketsOnStringTest {

    CheckBracketsOnString ch = new CheckBracketsOnString();
    String correctString = "s(dhgj_sfbfj)";
    String wrongString = "s)dhgj_)sfbfj)";
    String wrongString2 = "s()dhgj_{}sfbfjefd}";


    @Test
    public void checkString_whenCorrectString() {

        assertTrue(ch.checkString(correctString));
    }

    @Test
    public void checkString_whenWrongString() {

        assertFalse(ch.checkString(wrongString));
    }

    @Test
    public void testFullCheck_CorrectString() {
        String correctString = "{([f])}";
        assertTrue(ch.fullCheck(correctString));
    }

    @Test
    public void testFullCheck_WrongString() {
        assertFalse(ch.fullCheck(wrongString));
    }
    @Test
    public void testFullCheck_EmptyString() {
        assertFalse(ch.fullCheck(""));
    }

    @Test
    public void testFull_Wrong2() {
        assertFalse(ch.fullCheck(wrongString2));
    }
}
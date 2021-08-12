import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringExampleTest {

    @Test
    public void TestForCompareFirstAndLastCharSame(){
        StringExample se = new StringExample();
        boolean actualValue = se.compareFirstAndLastCharAreSame("ABAB");
        boolean expectedValue = true;
        assertEquals(actualValue,true);
       // assertTrue(actualValue);
       // assertFalse(actualValue);
        //assertEquals(actualValue,false);
    }
}

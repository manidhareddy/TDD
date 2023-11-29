package UnitTesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCasesForCheck {
    CheckFirstAndLast check1 = new CheckFirstAndLast();

    @Test
    public void testCase1(){
        assertEquals(true , check1.check("ABA"));
    }
    @Test
    public void testCase2(){
        assertEquals(false , check1.check("SBI"));
    }
    @Test
    public void testCase3(){
        assertEquals(true , check1.check("ICICI"));
    }
    @Test
    public void testCase4(){
        assertEquals(true , check1.check(""));
    }
    @Test
    public void testCase5(){
        assertEquals(true,check1.check("A"));
    }
}

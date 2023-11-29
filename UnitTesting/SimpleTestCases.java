package UnitTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTestCases {
    //Truncate A in first two position
    //Like "ABCD" -> "BCD"
    //"AA" -> ""
    //"ABCA" -> "BCA"
    StringTurncate sTurncate = new StringTurncate();
    @Test
    public void testCas1(){
        assertEquals("BCD" , sTurncate.turncateA("ABCD"));
    }
    @Test
    public void testCas2(){
        assertEquals("CD" , sTurncate.turncateA("AACD"));
    }
    @Test
    public void testCas3(){
        assertEquals("BCDA" , sTurncate.turncateA("BCDA"));
    }
    @Test
    public void testCase4(){
        assertEquals("",sTurncate.turncateA("A"));
    }
    @Test
    public void testCase5(){
        assertEquals("AA",sTurncate.turncateA("AAAA"));
    }
    @Test
    public void testCase6(){
        assertEquals("MNAA",sTurncate.turncateA("MNAA"));
    }
    @Test
    public void testCase7(){
        assertEquals("",sTurncate.turncateA(""));
    }
    @Test
    public void testCase8(){
        assertEquals("BCA",sTurncate.turncateA("ABCA"));
    }
}

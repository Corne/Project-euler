/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.two;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Corne
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    

    /**
     * Test of getSequenceBelowValue method, of class Fibonacci.
     */
    @Test
    public void testGetSequenceBelowValue() {
        int value = 10;
        Fibonacci instance = new Fibonacci();
        List<Long> expResult = Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L);
        List<Long> result = instance.getSequenceBelowValue(value);
        assertEquals(expResult, result);
    }
    
}

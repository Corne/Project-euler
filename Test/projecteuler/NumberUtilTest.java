/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class NumberUtilTest {
    
    public NumberUtilTest() {
    }

    /**
     * Test of calculateNumberOfDivisors method, of class NumberUtil.
     */
    @Test
    public void testCalculateNumberOfDivisors() {
        System.out.println("calculateNumberOfDivisors");
        int value = 10; 
        List<Integer> primelist = Arrays.asList(2, 3, 5, 7);
        int expResult = 4; //1, 2, 5, 10
        int result = NumberUtil.calculateNumberOfDivisors(value, primelist);
        assertEquals(expResult, result);
    }
    
}

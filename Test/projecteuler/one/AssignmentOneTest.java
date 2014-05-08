/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.one;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Corne
 */
@RunWith(Parameterized.class)
public class AssignmentOneTest {
    
    private final int expected;
    private final int maxValue;
    private final Integer[] multiplies;

    public AssignmentOneTest(int expected, int maxValue, Integer[] multiplies) {
        this.expected = expected;
        this.maxValue = maxValue;
        this.multiplies = multiplies;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
            { 23, 10, new Integer[] { 3, 5 } }, //given example euler
            { 0, 100, new Integer[] {} }, //total count is 0 with no multiplies
            { 12, 10, new Integer[] { 4 } },
            { 37, 10, new Integer[] { 2, 3, 5 } }
        };
        return Arrays.asList(data);
    }
    
    /**
     * Test of calculateSumOfMultiplies method, of class AssignmentOne.
     */
    @Test
    public void testCalculateSumOfMultiplies() {           
        AssignmentOne instance = new AssignmentOne();
        int result = instance.calculateSumOfMultiplies(maxValue, multiplies);
        assertEquals(expected, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.six;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentSixTest {
    
    public AssignmentSixTest() {
    }

    /**
     * Test of getSquareDifference method, of class AssignmentSix.
     */
    @Test
    public void testGetSquareDifference() {
        System.out.println("getSquareDifference");
        long lowerValue = 1;
        long upperValue = 10;
        AssignmentSix instance = new AssignmentSix();
        long expResult = 2640L;
        long result = instance.getSquareDifference(lowerValue, upperValue);
        assertEquals(expResult, result);
    }
    
}

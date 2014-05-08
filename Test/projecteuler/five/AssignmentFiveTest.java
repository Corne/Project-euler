/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.five;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentFiveTest {
    
    public AssignmentFiveTest() {
    }

    /**
     * Test of findSmallestDivisible method, of class AssignmentFive.
     */
    @Test
    public void testFindSmallestDivisible() {
        System.out.println("findSmallestDivisible");
        int lowerValue = 1;
        int upperValue = 10;
        AssignmentFive instance = new AssignmentFive();
        long expResult = 2520L;
        long result = instance.findSmallestDivisible(lowerValue, upperValue);
        assertEquals(expResult, result);
    }
    
}

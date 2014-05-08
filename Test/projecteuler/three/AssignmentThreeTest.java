/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.three;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentThreeTest {
    
    public AssignmentThreeTest() {
    }

    /**
     * Test of findMaxPrimeFactor method, of class AssignmentThree.
     */
    @Test
    public void testFindMaxPrimeFactor() {
        System.out.println("findMaxPrimeFactor");
        long value = 13195L;
        AssignmentThree instance = new AssignmentThree();
        long expResult = 29L;
        long result = instance.findMaxPrimeFactor(value);
        assertEquals(expResult, result);
    }
    
}

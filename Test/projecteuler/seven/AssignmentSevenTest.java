/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.seven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentSevenTest {
    
    public AssignmentSevenTest() {
    }

    /**
     * Test of getPrime method, of class AssignmentSeven.
     */
    @Test
    public void testGetPrime() {
        System.out.println("getPrime");
        int index = 6;
        AssignmentSeven instance = new AssignmentSeven();
        long expResult = 13L;
        long result = instance.getPrime(index);
        assertEquals(expResult, result);
    }
    
}

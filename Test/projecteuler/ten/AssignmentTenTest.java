/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.ten;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentTenTest {
    
    public AssignmentTenTest() {
    }

    /**
     * Test of getSumOfPrimesBelowValue method, of class AssignmentTen.
     */
    @Test
    public void testGetSumOfPrimesBelowValue() {
        System.out.println("getSumOfPrimesBelowValue");
        int value = 10; // 2million cost +/- 350seconds to sovle
        AssignmentTen instance = new AssignmentTen();
        int expResult = 17;
        int result = instance.getSumOfPrimesBelowValue(value);
        assertEquals(expResult, result);
    }
    
}

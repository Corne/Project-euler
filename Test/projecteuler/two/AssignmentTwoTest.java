/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.two;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentTwoTest {
    
    public AssignmentTwoTest() {
    }

    /**
     * Test of sumEvenFiboNumbers method, of class AssignmentTwo.
     * TODO test with params
     */
    @Test
    public void testSumEvenFiboNumbers() {
        System.out.println("sumEvenFiboNumbers");
        long maxValue = 4000000L; //euler number
        AssignmentTwo instance = new AssignmentTwo();
        int expResult = 4613732; // given answer by test run :D
        long result = instance.sumEvenFiboNumbers(maxValue);
        assertEquals(expResult, result);
    }
    
}

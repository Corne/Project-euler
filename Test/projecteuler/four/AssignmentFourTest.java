/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.four;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentFourTest {
    
    public AssignmentFourTest() {
    }

    /**
     * Test of findLargestPalindrome method, of class AssignmentFour.
     */
    @Test
    public void testFindLargestPalindrome() {
        System.out.println("findLargestPalindrome");
        int digits = 2;
        AssignmentFour instance = new AssignmentFour();
        Long expResult = 9009L;
        Long result = instance.findLargestPalindrome(digits);
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.twelve;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentTwelveTest {
    
    public AssignmentTwelveTest() {
    }

    /**
     * Test of getFirstTriangleNumberByDivisors method, of class AssignmentTwelve.
     */
    @Test
    public void testGetFirstTriangleNumberByDivisors() {
        System.out.println("getFirstTriangleNumberByDivisors");
        int numberOfDivisors = 6;
        AssignmentTwelve instance = new AssignmentTwelve();
        int expResult = 28;
        int result = instance.getFirstTriangleNumberByDivisors(numberOfDivisors);
        assertEquals(expResult, result);
    }
    
}

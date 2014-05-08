/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.nine;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class PythagoreanTest {
    
    public PythagoreanTest() {
    }

    /**
     * todo test false / multiple cases
     * Test of isPythagoreanTriplet method, of class Pythagorean.
     */
    @Test
    public void testIsPythagoreanTriplet() {
        System.out.println("isPythagoreanTriplet");
        int a = 3;
        int b = 4;
        int c = 5;
        Boolean expResult = true;
        Boolean result = Pythagorean.isPythagoreanTriplet(a, b, c);
        assertEquals(expResult, result);
    }
    
}

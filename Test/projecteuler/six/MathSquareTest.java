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
public class MathSquareTest {
    
    public MathSquareTest() {
    }

    /**
     * Test of sumSquare method, of class MathSquare.
     */
    @Test
    public void testSumSquare() {
        System.out.println("sumSquare");
        long lowerValue = 1;
        long upperValue = 10;
        MathSquare instance = new MathSquare(lowerValue, upperValue);
        long expResult = 385L;
        long result = instance.sumSquare();
        assertEquals(expResult, result);
    }

    /**
     * Test of squareSum method, of class MathSquare.
     */
    @Test
    public void testSquareSum() {
        System.out.println("squareSum");
        long lowerValue = 1;
        long upperValue = 10;
        MathSquare instance = new MathSquare(lowerValue, upperValue);
        long expResult = 3025L;
        long result = instance.squareSum();
        assertEquals(expResult, result);
    }
    
}

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
public class AssignmentNineTest {
    
    public AssignmentNineTest() {
    }

    /**
     * Test of getPythagreanTripletProductForSum method, of class AssignmentNine.
     */
    @Test
    public void testGetPythagreanTripletProductForSum() {
        System.out.println("getPythagreanTripletProductForSum");
        //int sum = 1000;
        int sum = 12;
        AssignmentNine instance = new AssignmentNine();
        int expResult = 60;
        int result = instance.getPythagoreanTripletProductForSum(sum);
        assertEquals(expResult, result);
    }
    
}

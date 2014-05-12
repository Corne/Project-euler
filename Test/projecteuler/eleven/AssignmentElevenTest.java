/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.eleven;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class AssignmentElevenTest {
    
    public AssignmentElevenTest() {
    }

    /**
     * Test of getGreatesProductOfAdjacentNumbers method, of class AssignmentEleven.
     */
    @Test
    public void testGetGreatesProductOfAdjacentNumbers() {
        System.out.println("getGreatesProductOfAdjacentNumbers");
        Grid grid = new Grid(new int[][] {{1, 2, 3}, {1, 4, 1}, {3, 8, 2}});
        int adjacentValues = 2; 
        AssignmentEleven instance = new AssignmentEleven();
        long expResult = 32L; //4*8
        long result = instance.getGreatesProductOfAdjacentNumbers(grid, adjacentValues);
        assertEquals(expResult, result);
    }
    
}

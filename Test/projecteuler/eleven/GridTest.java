/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class GridTest {
    
    public GridTest() {
    }

    /**
     * Test of getAdjacentCells method, of class Grid.
     */
    @Test
    public void testGetAdjacentSequences() {
        System.out.println("getAdjacentCells");
        int x = 1;
        int y = 0;
        int numberOfCells = 1;
        Grid instance = new Grid(new int[][] {
            {1, 2, 3}, 
            {6, 4, 7}, 
            {3, 8, 2}
        });
        
        
        List<List<Integer>> expResult = new ArrayList<>();
        expResult.add(Arrays.asList(1, 2));
        expResult.add(Arrays.asList(2, 4));
        expResult.add(Arrays.asList(2, 3));
        expResult.add(Arrays.asList(6, 2));
        expResult.add(Arrays.asList(2, 7));

        
        List<List<Integer>> result = instance.getAdjacentSequences(x, y, numberOfCells);
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.eleven;

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
     * Test of getRightSequence method, of class Grid.
     */
    @Test
    public void testGetRightSequence() {
        System.out.println("getRightSequence");
        int x = 1;
        int y = 1;
        int numberOfCells = 2;
        Grid instance = new Grid(new int[][] {
            {1, 2, 3}, 
            {6, 4, 7}, 
            {3, 8, 2}
        });
        List<Integer> expResult = Arrays.asList(4, 7);
        List<Integer> result = instance.getRightSequence(x, y, numberOfCells);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDownSequence method, of class Grid.
     */
    @Test
    public void testGetDownSequence() {
        System.out.println("getDownSequence");
        int x = 1;
        int y = 1;
        int numberOfCells = 2;
        Grid instance = new Grid(new int[][] {
            {1, 2, 3}, 
            {6, 4, 7}, 
            {3, 8, 2}
        });
        List<Integer> expResult = Arrays.asList(4, 8);
        List<Integer> result = instance.getDownSequence(x, y, numberOfCells);
        assertEquals(expResult, result);
    }

    /**
     * Test of getVerticalDownSequence method, of class Grid.
     */
    @Test
    public void testGetRightDownSequence() {
        System.out.println("getRightDownSequence");
        int x = 1;
        int y = 1;
        int numberOfCells = 2;
        Grid instance = new Grid(new int[][] {
            {1, 2, 3}, 
            {6, 4, 7}, 
            {3, 8, 2}
        });
        List<Integer> expResult = Arrays.asList(4, 2);
        List<Integer> result = instance.getRightDownSequence(x, y, numberOfCells);
        assertEquals(expResult, result);
    }

    /**
     * Test of getVerticalUpSequence method, of class Grid.
     */
    @Test
    public void testGetLeftDownSequence() {
        System.out.println("getLeftDownSequence");
        int x = 1;
        int y = 1;
        int numberOfCells = 2;
        Grid instance = new Grid(new int[][] {
            {1, 2, 3}, 
            {6, 4, 7}, 
            {3, 8, 2}
        });
        List<Integer> expResult = Arrays.asList(4, 3);
        List<Integer> result = instance.getLeftDownSequence(x, y, numberOfCells);
        assertEquals(expResult, result);
    }
    
}

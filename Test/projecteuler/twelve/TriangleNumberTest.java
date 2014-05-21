/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.twelve;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class TriangleNumberTest {

    public TriangleNumberTest() {
    }

    @Test
    public void testConstructorWithIndexGeneratesValues() {
        TriangleNumber triangle = new TriangleNumber(5);
        Set<Integer> expected = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(expected, triangle.getNumbers());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithSetThrowsExecptionWithInvalidVaues() {
        TreeSet<Integer> input = new TreeSet<>(Arrays.asList(1, 2, 3, 5));
        TriangleNumber triangle = new TriangleNumber(input);
    }

    @Test
    public void testGetValue() {
        //check if value is sum of the numbers
        TriangleNumber triangle = new TriangleNumber(5);
        int result = triangle.getValue();
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void testGetProduct() {
        TriangleNumber triangle = new TriangleNumber(5);
        int result = triangle.getProduct();
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void testGetDivisors() {
        TriangleNumber triangle = new TriangleNumber(5);
        Set<Integer> divisors = triangle.getDivisors();
        Set<Integer> expected = new TreeSet<>(Arrays.asList(1, 3, 5, 15));

        assertEquals(expected, divisors);
    }
}

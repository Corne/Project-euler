/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class PrimesTest {

    public PrimesTest() {
    }

    /**
     * Test of getPrimes method, of class PrimeSet.
     */
    @Test
    public void testFindMaxPrimeFactor() {
        long value = 10;
        SortedSet<Long> expResult = new TreeSet<>(Arrays.asList(2L, 5L));
        SortedSet<Long> result = Primes.findFactorPrimes(value);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetPrime() {
        int index = 5;
        long expexted = 13;
        Primes primes = new Primes();
        long result = primes.getPrime(index);
        
        assertEquals(expexted, result);
    }
    
    @Test
    public void testGetPrimesBelowValue() {
        //2 + 3 + 5 + 7
        int input = 10;
        List<Integer> expected =  Arrays.asList(2, 3, 5, 7);
        Primes primes = new Primes();
        List<Integer> result = primes.getPrimesBelowValue(input);
        
        assertEquals(expected, result);
    }
}

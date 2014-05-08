/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Corne
 */
public class PrimeUtilTest {

    public PrimeUtilTest() {
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
}

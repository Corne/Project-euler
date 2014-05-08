/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.three;

import projecteuler.Primes;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 * @author Corne
 */
public class AssignmentThree {
    
    public long findMaxPrimeFactor(long value){
        return Primes.findFactorPrimes(value).last();
    }
    
}

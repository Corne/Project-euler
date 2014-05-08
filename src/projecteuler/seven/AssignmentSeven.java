/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.seven;

import projecteuler.Primes;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * @author Corne
 */
public class AssignmentSeven {

    
    public long getPrime(int index){
        Primes primes = new Primes();
        //all we do is -1 on index, because an array start with 0 and we want the nth value
        return primes.getPrime(index-1);
    }
    
}

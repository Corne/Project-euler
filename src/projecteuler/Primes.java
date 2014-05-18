/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Corne
 */
public class Primes {

//            // initially assume all integers are prime
//        boolean[] isPrime = new boolean[N + 1];
//        for (int i = 2; i <= N; i++) {
//            isPrime[i] = true;
//        }
//
//        // mark non-primes <= N using Sieve of Eratosthenes
//        for (int i = 2; i*i <= N; i++) {
//
//            // if i is prime, then mark multiples of i as nonprime
//            // suffices to consider mutiples i, i+1, ..., N/i
//            if (isPrime[i]) {
//                for (int j = i; i*j <= N; j++) {
//                    isPrime[i*j] = false;
//                }
//            }
//        }
//
//        // count primes
//        int primes = 0;
//        for (int i = 2; i <= N; i++) {
//            if (isPrime[i]) primes++;
//        }
    //using list so we can use get
    
    private static final int MAX_ARRAY_SIZE = /*Integer.MAX_VALUE - 5*/ 1000000;
    private final Boolean[] bPrimes;
    private final List<Prime> primes;

    public Primes() {
        primes = new ArrayList<>();
               
        this.bPrimes = new Boolean[MAX_ARRAY_SIZE];
        Arrays.fill(bPrimes, true);
        bPrimes[0] = false;
        bPrimes[1] = false;
        
        for (int i = 2; i * i < MAX_ARRAY_SIZE; i++) {
            if (bPrimes[i]) {
                for (int j = i; i * j < MAX_ARRAY_SIZE; j++) {
                    bPrimes[i * j] = false;
                }
            }
        }
        
        for(int i=0; i<bPrimes.length; i++){
            primes.add(new Prime(i, bPrimes[i]));
        }
    }

    /**
     * TODO clean, adding to set is kinda ugly atm.
     *
     * @param value
     * @return
     */
    public static SortedSet<Long> findFactorPrimes(long value) {
        for (long i = 2; i < value; i++) {
            if (value % i == 0) {
                SortedSet<Long> result = findFactorPrimes(value / i);
                result.add(i);
                return result;
            }
        }
        TreeSet<Long> treeSet = new TreeSet<>();
        treeSet.add(value);
        return treeSet;
    }

    public long getPrime(int index) {
        return primes.stream().filter(p -> p.isIsPrime())
                .collect(Collectors.toCollection(ArrayList::new)).get(index).getValue();
    }

    public List<Integer> getPrimesBelowValue(int value) {
        return primes.subList(0, value).stream().filter(p -> p.isIsPrime() && p.getValue() < value)
                .map(p -> p.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
    }

}

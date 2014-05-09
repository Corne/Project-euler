/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Corne
 */
public class Primes {

    //using list so we can use get
    private final List<Long> primes;
    
    public Primes() {
        this.primes = new ArrayList<>();
        this.primes.add(2L);
    }
    
    /**
     * TODO clean, adding to set is kinda ugly atm.
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
        if(index < this.primes.size() -1){
            return primes.get(index);
        } else {
            primes.add(findNextPrime());
            return getPrime(index);
        }
    }
    //todo check if we can improve performance
    public List<Long> getPrimesBelowValue(long value){
        while(this.primes.get(this.primes.size() -1) < value){
            primes.add(findNextPrime());
        }
        return primes.subList(0, primes.size() - 1); //last one is over value
    }
    
    private long findNextPrime() {
        long startIndex = primes.get(primes.size() - 1);
        for (long i = startIndex; i < Long.MAX_VALUE; i++) {
            final long currentValue = i;
            if(primes.stream().noneMatch(p -> currentValue % p == 0)){
                return currentValue;
            }
        }
        return 0;
    }
}

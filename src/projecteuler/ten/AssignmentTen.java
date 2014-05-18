/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.ten;

import java.util.List;
import projecteuler.Primes;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * @author Corne
 */
public class AssignmentTen {

    //TODO check if we can improve perfomance, 2million check took around 350sec
    public int getSumOfPrimesBelowValue(int value) {
        Primes primes = new Primes();
        List<Integer> primesBelowValue = primes.getPrimesBelowValue(value);
        return primesBelowValue.stream().mapToInt(v -> v).sum();
    }
}

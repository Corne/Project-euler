/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.twelve;

import java.util.List;
import projecteuler.NumberUtil;
import projecteuler.Primes;

/**
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first
 * ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 * 1: 1. 3: 1,3 6: 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28:
 * 1,2,4,7,14,28
 *
 * We can see that 28 is the first triangle number to have over five divisors.
 *
 * What is the value of the first triangle number to have over five hundred
 * divisors?
 *
 * @author Corne
 */
public class AssignmentTwelve {

    public int getFirstTriangleNumberByDivisors(int numberOfDivisors) {
        Primes primes = new Primes();
        List<Integer> primelist = primes.getPrimesBelowValue(1000000);

        int number = 0;
        int i = 1;

        while (NumberUtil.calculateNumberOfDivisors(number, primelist) < numberOfDivisors) {
            //keep incremting the number with 1 more
            number += i;
            i++;
        }

        return number;
    }

}

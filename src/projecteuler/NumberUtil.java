/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.List;

/**
 *
 * @author Corne
 */
public class NumberUtil {

    public static int calculateNumberOfDivisors(int value, List<Integer> primelist) {
        int numberOfDivisors = 1;
        int exponent;

        int remainder = value;

        for (Integer prime : primelist) {
            //if prime exponext > value, we are over the half, so we can multiply NoD * 2, and have our result
            if (prime * prime == value) {
                return numberOfDivisors * 2 + 1;
            } else if (prime * prime > value) {
                return numberOfDivisors * 2;
            }
            exponent = 1;
            while (remainder % prime == 0) {
                exponent++;
                remainder = remainder / prime;
            }
            numberOfDivisors *= exponent;
            if (remainder == 1) {
                return numberOfDivisors;
            }
        }
        return numberOfDivisors;
    }
}

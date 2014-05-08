/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.four;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Corne
 */
public class PalinDromeUtil {
    
    
    public static Boolean isPalindrome(String value) {
        return value.equals(new StringBuilder(value).reverse().toString());
    }
    
    // brute force solution, todo find if we can find better solution
    public static SortedSet<Long> findFactorPalinDromes(long digit) {
        SortedSet<Long> result = new TreeSet<>();
        //exampel start value 10^2=100, maxValue 10^3=1000
        long startValue = (long) Math.pow(10, digit - 1);
        long maxValue = (long) Math.pow(10, digit);
        for(Long i=startValue; i<maxValue; i++){
            for(Long j=startValue; j<maxValue; j++){
                Long value = j * i;
                if(isPalindrome(value.toString())){
                    result.add(value);
                }
            }
        }
        return result;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.one;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Corne
 */
public class AssignmentOne {

    /**
     *
     * @param maxValue
     * @param multiplies
     * @return
     */
    public int calculateSumOfMultiplies(int maxValue, Integer[] multiplies) {
        int sum = 0;
        List<Integer> multipliesList = Arrays.asList(multiplies);
        for (int i = 1; i < maxValue; i++) {
            //can't use i in lambda, need final variable?
            final int test = i;
            if(multipliesList.stream().anyMatch(m -> test % m == 0)){ // java lambda :)
                sum += test;
            }
        }
        return sum;
    }
}

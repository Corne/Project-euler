/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.five;

import java.util.List;
import projecteuler.ListUtil;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 *
 * @author Corne
 */
public class AssignmentFive {

    // 2520 = 10 * 9 * 7 * 4 = 5*2 * 3*3 * 7 * 2*2
    // logic...
    //just loop with steps of 20 i guess, till we have % all == 0
    public long findSmallestDivisible(int lowerValue, int upperValue) {
        List<Long> values = ListUtil.createListFromRange(lowerValue, upperValue);
        for (long i = upperValue * (upperValue - 1); i < Long.MAX_VALUE; i = i + upperValue) {
            final long currentValue = i;
            if(values.stream().allMatch(v ->currentValue % v == 0)) {
                return currentValue;
            }
        }
        //normally would throw an exception, if no result found
        return 0;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.two;

import java.util.List;

/**
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... By considering the terms in the
 * Fibonacci sequence whose values do not exceed four million, find the sum of
 * the even-valued terms.
 *
 * @author Corne
 */
public class AssignmentTwo {

    public long sumEvenFiboNumbers(long maxValue) {
        Fibonacci fibo = new Fibonacci();
        List<Long> sequenceBelowValue = fibo.getSequenceBelowValue(maxValue);
        //sum even
        return sequenceBelowValue.stream().filter(value -> value % 2 == 0)
                .mapToLong(value -> value).sum();
    }

}

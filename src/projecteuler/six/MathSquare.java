/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler.six;

import java.util.List;
import projecteuler.ListUtil;

/**
 *
 * @author Corne
 */
public class MathSquare {
    
    private final long lowerValue;
    private final long upperValue;
    private final List<Long> values;

    public MathSquare(long lowerValue, long upperValue) {
        this.lowerValue = lowerValue;
        this.upperValue = upperValue;
        this.values = ListUtil.createListFromRange(lowerValue, upperValue);
    }
    
    public long sumSquare() {
        return values.stream().mapToLong(v -> (long)Math.pow(v, 2)).sum();
    }
    
    public long squareSum() {
        long valueSum = values.stream().mapToLong(v -> v).sum();
        return (long) Math.pow(valueSum, 2);
    }
    
}

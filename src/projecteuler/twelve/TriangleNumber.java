/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.twelve;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Corne
 */
public class TriangleNumber {
    
    private final Set<Integer> numbers;
    private final int value; //sum of the numbers

    public TriangleNumber(int index) {
        numbers = new TreeSet<>();
        for (int i = 1; i <= index; i++) {
            numbers.add(i);
        }
        this.value = getSum();
    }

    public TriangleNumber(TreeSet<Integer> numbers) {
        if (numbers.first() != 1 || numbers.last() != numbers.size()) {
            throw new IllegalArgumentException("given set is not a triangle number");
        }
        this.numbers = new TreeSet<>(numbers); //don't keep the reference
        this.value = getSum();
    }

    private int getSum() {
        return numbers.stream().mapToInt(n -> n).sum();
    }
    
    public int getValue() {
        return this.value;
    }

    public int getProduct() {
        return numbers.stream().reduce(1, (n1, n2) -> n1 * n2);
    }

    public Set<Integer> getDivisors() {
        Set<Integer> result = new TreeSet<>();
        for(int i=1; i<=value/2; i++){
            if(value % i == 0) {
                result.add(i);
            }
        }
        result.add(value);//add value itself
        return result;
    }
    
    public Set<Integer> getNumbers() {
        return this.numbers;
    }
}

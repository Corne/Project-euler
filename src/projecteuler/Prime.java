/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projecteuler;

/**
 *
 * @author Corne
 */
public class Prime {
    
    private final Integer value;
    private final Boolean isPrime;

    public Prime(Integer value, Boolean isPrime) {
        this.value = value;
        this.isPrime = isPrime;
    }

    public Integer getValue() {
        return value;
    }

    public Boolean isIsPrime() {
        return isPrime;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.six;

/**
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... +
 * 102 = 385
 *
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * @author Corne
 */
public class AssignmentSix {

    
    public long getSquareDifference(long lowerValue, long upperValue){
        MathSquare mathsquare = new MathSquare(lowerValue, upperValue);
        //maybe needed to check wich one is upper/lower value?
        return mathsquare.squareSum() - mathsquare.sumSquare();
    }
    
}

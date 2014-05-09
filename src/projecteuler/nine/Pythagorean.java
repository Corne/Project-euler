/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.nine;

/**
 *
 * @author Corne
 */
public class Pythagorean {

    public static Boolean isPythagoreanTriplet(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static PythagoreanTriplet getPythagoreanTripletForSum(int sum) {
        //todo check if we can write a bit more cleaner code
        int b = sum;
        for (int a = 1; a < b; a++) {
            b = a + 1;
            int c = sum - a - b;
            for (; b < c; b++) {
                if (Pythagorean.isPythagoreanTriplet(a, b, c)) {
                    return new PythagoreanTriplet(a, b, c);
                }
                c--;
            }
        }
        return null;
    }
    
    
}

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
    
}

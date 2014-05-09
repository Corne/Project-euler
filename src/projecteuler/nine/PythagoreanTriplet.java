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
public class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        if (!Pythagorean.isPythagoreanTriplet(a, b, c)) {
            throw new IllegalArgumentException("The combination of a, b and c, " +
                    "isn't a Pythagorean triplet ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}

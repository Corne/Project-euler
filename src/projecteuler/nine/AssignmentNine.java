/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.nine;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 *
 * @author Corne
 */
public class AssignmentNine {

    /**
     * todo check if we can find some logic to find the triplets
     *
     * @param sum of the triplet
     * @return product of the triplet
     */
    public int getPythagoreanTripletProductForSum(int sum) {
        PythagoreanTriplet triplet = Pythagorean.getPythagoreanTripletForSum(sum);
        return triplet.getA() * triplet.getB() * triplet.getC();
    }

}

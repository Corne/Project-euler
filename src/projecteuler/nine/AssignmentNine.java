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
        //really ugly code, todo fix, make more OO solution
        int b=sum;
        for(int a=1; a<b; a++){
            b = a+1;
            int c = sum-a-b;
            for(;b < c; b++){
                if(Pythagorean.isPythagoreanTriplet(a, b, c)){
                    return a*b*c;
                }
                c--;
            }
        }
        
        return 0;
    }

}
